namespace WindowsFormsApplication4
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            this.input = new System.Windows.Forms.TextBox();
            this.ouptut = new System.Windows.Forms.TextBox();
            this.btnoutput = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.info = new System.Windows.Forms.ToolTip(this.components);
            this.btninput = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // input
            // 
            this.input.Location = new System.Drawing.Point(120, 65);
            this.input.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.input.Name = "input";
            this.input.Size = new System.Drawing.Size(509, 22);
            this.input.TabIndex = 0;
            this.input.TextChanged += new System.EventHandler(this.input_TextChanged);
            // 
            // ouptut
            // 
            this.ouptut.Location = new System.Drawing.Point(120, 97);
            this.ouptut.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.ouptut.Name = "ouptut";
            this.ouptut.Size = new System.Drawing.Size(509, 22);
            this.ouptut.TabIndex = 2;
            this.ouptut.TextChanged += new System.EventHandler(this.ouptut_TextChanged);
            // 
            // btnoutput
            // 
            this.btnoutput.Font = new System.Drawing.Font("Modern No. 20", 7.875F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnoutput.Location = new System.Drawing.Point(654, 97);
            this.btnoutput.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btnoutput.Name = "btnoutput";
            this.btnoutput.Size = new System.Drawing.Size(72, 31);
            this.btnoutput.TabIndex = 3;
            this.btnoutput.Text = "zgjedh";
            this.btnoutput.UseVisualStyleBackColor = true;
            this.btnoutput.Click += new System.EventHandler(this.btnoutput_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(25, 69);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(83, 16);
            this.label1.TabIndex = 4;
            this.label1.Text = "fajlli origjinal:";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(25, 98);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(82, 16);
            this.label2.TabIndex = 5;
            this.label2.Text = "destinacioni:";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(28, 170);
            this.button1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(123, 26);
            this.button1.TabIndex = 6;
            this.button1.Text = "kripto";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(157, 170);
            this.button2.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(123, 26);
            this.button2.TabIndex = 7;
            this.button2.Text = "dekripto";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // btninput
            // 
            this.btninput.Font = new System.Drawing.Font("Modern No. 20", 7.875F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btninput.Location = new System.Drawing.Point(654, 62);
            this.btninput.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.btninput.Name = "btninput";
            this.btninput.Size = new System.Drawing.Size(71, 28);
            this.btninput.TabIndex = 1;
            this.btninput.Text = "browse";
            this.btninput.UseVisualStyleBackColor = true;
            this.btninput.Click += new System.EventHandler(this.btninput_Click);
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(456, 36);
            this.textBox1.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(173, 22);
            this.textBox1.TabIndex = 8;
            this.textBox1.TextChanged += new System.EventHandler(this.textBox1_TextChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(417, 39);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(33, 16);
            this.label3.TabIndex = 4;
            this.label3.Text = "Key:";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.ActiveCaption;
            this.ClientSize = new System.Drawing.Size(792, 263);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnoutput);
            this.Controls.Add(this.ouptut);
            this.Controls.Add(this.btninput);
            this.Controls.Add(this.input);
            this.ForeColor = System.Drawing.SystemColors.ActiveCaptionText;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Margin = new System.Windows.Forms.Padding(3, 2, 3, 2);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox input;
        private System.Windows.Forms.TextBox ouptut;
        private System.Windows.Forms.Button btnoutput;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.ToolTip info;
        private System.Windows.Forms.Button btninput;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label label3;
    }
}

