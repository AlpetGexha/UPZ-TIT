import os
import re
import pdfplumber

def extract_programs_from_pdf(pdf_file_path):
    # Define the program patterns to search for in the PDF
    program_patterns = [
        r'\$cat >(.+?)\n(.*?)Shtypim CTRL\+D',
        r'\$cat> (.+?)\n(.*?)Shtypim CTRL\+D'
    ]
    # Compile the program patterns into regular expressions
    program_regex = [re.compile(pattern, re.DOTALL) for pattern in program_patterns]

    # Open the PDF file using pdfplumber
    with pdfplumber.open(pdf_file_path) as pdf:
        # Extract text from each page and concatenate them
        page_text = ''.join(page.extract_text() for page in pdf.pages)

        # Iterate through each compiled regex and find matches in the page text
        for regex in program_regex:
            matches = regex.findall(page_text)
            for match in matches:
                # Extract the program name and content from the match
                program_name = match[0].strip()
                program_content = match[1].strip()

                # Check if both program name and content are non-empty
                if program_name and program_content:
                    # Remove the page number from the program name
                    program_name = remove_page_number(program_name)

                    # Remove the last line from the program content
                    program_content = program_content.rsplit('\n', 1)[0]

                    # Replace curly quotation marks with straight quotation marks
                    program_content = program_content.replace("“", "\"").replace("”", "\"")

                    # Add shebang and new lines at the beginning of the program content
                    program_content = "#!/bin/bash\n" + program_content

                    # Save the program content to a file
                    save_program(program_name, program_content)

def remove_page_number(program_name):
    # Remove the page number using regex pattern
    return re.sub(r'_\d+$', '', program_name)

def save_program(program_name, program_content):
    # Create a new file with the program name and write the content to it
    file_name = program_name + '.sh'
    with open(file_name, 'w', encoding='utf-8') as file:
        file.write(program_content)
    # Print a message indicating the program creation
    print("Created program:", program_name)

# Specify the directory containing the PDF files
pdf_directory = 'pdf/'
# Get a list of all PDF files in the directory
pdf_files = [file for file in os.listdir(pdf_directory) if file.lower().endswith('.pdf')]

# Process each PDF file
for pdf_file in pdf_files:
    pdf_file_path = os.path.join(pdf_directory, pdf_file)
    extract_programs_from_pdf(pdf_file_path)
