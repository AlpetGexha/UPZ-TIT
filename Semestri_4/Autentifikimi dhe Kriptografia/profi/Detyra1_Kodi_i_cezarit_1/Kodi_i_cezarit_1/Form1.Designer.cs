namespace Kodi_i_cezarit_1
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
            this.txtOrigjinal = new System.Windows.Forms.TextBox();
            this.txtCipherText = new System.Windows.Forms.TextBox();
            this.btnEnkripto = new System.Windows.Forms.Button();
            this.btnDekripto = new System.Windows.Forms.Button();
            this.btnDil = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txtOrigjinal
            // 
            this.txtOrigjinal.Location = new System.Drawing.Point(225, 154);
            this.txtOrigjinal.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.txtOrigjinal.Multiline = true;
            this.txtOrigjinal.Name = "txtOrigjinal";
            this.txtOrigjinal.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtOrigjinal.Size = new System.Drawing.Size(822, 169);
            this.txtOrigjinal.TabIndex = 0;
            this.txtOrigjinal.TextChanged += new System.EventHandler(this.txtOrigjinal_TextChanged);
            // 
            // txtCipherText
            // 
            this.txtCipherText.Location = new System.Drawing.Point(225, 368);
            this.txtCipherText.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.txtCipherText.Multiline = true;
            this.txtCipherText.Name = "txtCipherText";
            this.txtCipherText.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.txtCipherText.Size = new System.Drawing.Size(822, 156);
            this.txtCipherText.TabIndex = 1;
            this.txtCipherText.TextChanged += new System.EventHandler(this.txtCipherText_TextChanged);
            // 
            // btnEnkripto
            // 
            this.btnEnkripto.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEnkripto.Location = new System.Drawing.Point(242, 585);
            this.btnEnkripto.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.btnEnkripto.Name = "btnEnkripto";
            this.btnEnkripto.Size = new System.Drawing.Size(165, 65);
            this.btnEnkripto.TabIndex = 2;
            this.btnEnkripto.Text = "Enkripto";
            this.btnEnkripto.UseVisualStyleBackColor = true;
            this.btnEnkripto.Click += new System.EventHandler(this.btnEnkripto_Click);
            // 
            // btnDekripto
            // 
            this.btnDekripto.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDekripto.Location = new System.Drawing.Point(549, 585);
            this.btnDekripto.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.btnDekripto.Name = "btnDekripto";
            this.btnDekripto.Size = new System.Drawing.Size(165, 65);
            this.btnDekripto.TabIndex = 3;
            this.btnDekripto.Text = "Dekripto";
            this.btnDekripto.UseVisualStyleBackColor = true;
            this.btnDekripto.Click += new System.EventHandler(this.btnDekripto_Click);
            // 
            // btnDil
            // 
            this.btnDil.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDil.Location = new System.Drawing.Point(848, 585);
            this.btnDil.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.btnDil.Name = "btnDil";
            this.btnDil.Size = new System.Drawing.Size(183, 65);
            this.btnDil.TabIndex = 4;
            this.btnDil.Text = "Dil";
            this.btnDil.UseVisualStyleBackColor = true;
            this.btnDil.Click += new System.EventHandler(this.btnDil_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(72, 220);
            this.label1.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(138, 37);
            this.label1.TabIndex = 5;
            this.label1.Text = "Plaintext";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.Location = new System.Drawing.Point(58, 415);
            this.label2.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(161, 37);
            this.label2.TabIndex = 6;
            this.label2.Text = "Ciphertext";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 24F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.Location = new System.Drawing.Point(440, 14);
            this.label3.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(322, 55);
            this.label3.TabIndex = 7;
            this.label3.Text = "Kodi i Cezarit";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 20F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1186, 668);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.btnDil);
            this.Controls.Add(this.btnDekripto);
            this.Controls.Add(this.btnEnkripto);
            this.Controls.Add(this.txtCipherText);
            this.Controls.Add(this.txtOrigjinal);
            this.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtOrigjinal;
        private System.Windows.Forms.TextBox txtCipherText;
        private System.Windows.Forms.Button btnEnkripto;
        private System.Windows.Forms.Button btnDekripto;
        private System.Windows.Forms.Button btnDil;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
    }
}

