namespace RSA_ORA
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
            this.groupBox5 = new System.Windows.Forms.GroupBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtq = new System.Windows.Forms.TextBox();
            this.txtp = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.txte = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtd = new System.Windows.Forms.TextBox();
            this.groupBox3 = new System.Windows.Forms.GroupBox();
            this.txtTekstiKriptuar = new System.Windows.Forms.TextBox();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.txtTekstiPerKriptim = new System.Windows.Forms.TextBox();
            this.groupBox4 = new System.Windows.Forms.GroupBox();
            this.txtTekstiKriptuarByteArray = new System.Windows.Forms.TextBox();
            this.btnKripto = new System.Windows.Forms.Button();
            this.groupBox2 = new System.Windows.Forms.GroupBox();
            this.txtTekstiDekriptuar = new System.Windows.Forms.TextBox();
            this.btnDekripto = new System.Windows.Forms.Button();
            this.btnParamRSATeRi = new System.Windows.Forms.Button();
            this.btnMbyll = new System.Windows.Forms.Button();
            this.groupBox5.SuspendLayout();
            this.groupBox3.SuspendLayout();
            this.groupBox1.SuspendLayout();
            this.groupBox4.SuspendLayout();
            this.groupBox2.SuspendLayout();
            this.SuspendLayout();
            // 
            // groupBox5
            // 
            this.groupBox5.Controls.Add(this.label1);
            this.groupBox5.Controls.Add(this.label2);
            this.groupBox5.Controls.Add(this.txtq);
            this.groupBox5.Controls.Add(this.txtp);
            this.groupBox5.Controls.Add(this.label3);
            this.groupBox5.Controls.Add(this.txte);
            this.groupBox5.Controls.Add(this.label4);
            this.groupBox5.Controls.Add(this.txtd);
            this.groupBox5.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox5.Location = new System.Drawing.Point(12, 7);
            this.groupBox5.Name = "groupBox5";
            this.groupBox5.Size = new System.Drawing.Size(714, 224);
            this.groupBox5.TabIndex = 5;
            this.groupBox5.TabStop = false;
            this.groupBox5.Text = "Parameterat për RSA";
            // 
            // label1
            // 
            this.label1.Location = new System.Drawing.Point(8, 31);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(16, 16);
            this.label1.TabIndex = 0;
            this.label1.Text = "p";
            // 
            // label2
            // 
            this.label2.Location = new System.Drawing.Point(8, 77);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(16, 16);
            this.label2.TabIndex = 0;
            this.label2.Text = "q";
            // 
            // txtq
            // 
            this.txtq.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtq.Location = new System.Drawing.Point(24, 59);
            this.txtq.Multiline = true;
            this.txtq.Name = "txtq";
            this.txtq.ReadOnly = true;
            this.txtq.Size = new System.Drawing.Size(684, 40);
            this.txtq.TabIndex = 5;
            // 
            // txtp
            // 
            this.txtp.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtp.Location = new System.Drawing.Point(24, 16);
            this.txtp.Multiline = true;
            this.txtp.Name = "txtp";
            this.txtp.ReadOnly = true;
            this.txtp.Size = new System.Drawing.Size(684, 40);
            this.txtp.TabIndex = 4;
            this.txtp.TextChanged += new System.EventHandler(this.txtp_TextChanged);
            // 
            // label3
            // 
            this.label3.Location = new System.Drawing.Point(8, 108);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(16, 16);
            this.label3.TabIndex = 0;
            this.label3.Text = "e";
            // 
            // txte
            // 
            this.txte.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txte.Location = new System.Drawing.Point(24, 102);
            this.txte.Multiline = true;
            this.txte.Name = "txte";
            this.txte.ReadOnly = true;
            this.txte.Size = new System.Drawing.Size(684, 29);
            this.txte.TabIndex = 6;
            // 
            // label4
            // 
            this.label4.Location = new System.Drawing.Point(8, 169);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(16, 29);
            this.label4.TabIndex = 0;
            this.label4.Text = "d";
            // 
            // txtd
            // 
            this.txtd.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtd.Location = new System.Drawing.Point(24, 135);
            this.txtd.Multiline = true;
            this.txtd.Name = "txtd";
            this.txtd.ReadOnly = true;
            this.txtd.Size = new System.Drawing.Size(684, 81);
            this.txtd.TabIndex = 7;
            // 
            // groupBox3
            // 
            this.groupBox3.Controls.Add(this.txtTekstiKriptuar);
            this.groupBox3.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox3.Location = new System.Drawing.Point(12, 283);
            this.groupBox3.Name = "groupBox3";
            this.groupBox3.Size = new System.Drawing.Size(714, 48);
            this.groupBox3.TabIndex = 7;
            this.groupBox3.TabStop = false;
            this.groupBox3.Text = "Teksti i kriptuar";
            // 
            // txtTekstiKriptuar
            // 
            this.txtTekstiKriptuar.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtTekstiKriptuar.Font = new System.Drawing.Font("Elephant", 25.8F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtTekstiKriptuar.Location = new System.Drawing.Point(8, 18);
            this.txtTekstiKriptuar.Multiline = true;
            this.txtTekstiKriptuar.Name = "txtTekstiKriptuar";
            this.txtTekstiKriptuar.ReadOnly = true;
            this.txtTekstiKriptuar.Size = new System.Drawing.Size(700, 24);
            this.txtTekstiKriptuar.TabIndex = 2;
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.txtTekstiPerKriptim);
            this.groupBox1.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox1.Location = new System.Drawing.Point(12, 232);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(714, 45);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "Teksti për kriptim";
            // 
            // txtTekstiPerKriptim
            // 
            this.txtTekstiPerKriptim.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtTekstiPerKriptim.ForeColor = System.Drawing.Color.Red;
            this.txtTekstiPerKriptim.Location = new System.Drawing.Point(8, 16);
            this.txtTekstiPerKriptim.Multiline = true;
            this.txtTekstiPerKriptim.Name = "txtTekstiPerKriptim";
            this.txtTekstiPerKriptim.Size = new System.Drawing.Size(700, 24);
            this.txtTekstiPerKriptim.TabIndex = 0;
            this.txtTekstiPerKriptim.Text = "AlpetGexha";
            // 
            // groupBox4
            // 
            this.groupBox4.Controls.Add(this.txtTekstiKriptuarByteArray);
            this.groupBox4.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox4.Location = new System.Drawing.Point(12, 337);
            this.groupBox4.Name = "groupBox4";
            this.groupBox4.Size = new System.Drawing.Size(714, 99);
            this.groupBox4.TabIndex = 8;
            this.groupBox4.TabStop = false;
            this.groupBox4.Text = "Teksti i kriptuar (Byte Array)";
            // 
            // txtTekstiKriptuarByteArray
            // 
            this.txtTekstiKriptuarByteArray.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtTekstiKriptuarByteArray.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtTekstiKriptuarByteArray.Location = new System.Drawing.Point(6, 18);
            this.txtTekstiKriptuarByteArray.Multiline = true;
            this.txtTekstiKriptuarByteArray.Name = "txtTekstiKriptuarByteArray";
            this.txtTekstiKriptuarByteArray.ReadOnly = true;
            this.txtTekstiKriptuarByteArray.Size = new System.Drawing.Size(702, 75);
            this.txtTekstiKriptuarByteArray.TabIndex = 3;
            this.txtTekstiKriptuarByteArray.TextChanged += new System.EventHandler(this.txtTekstiKriptuarByteArray_TextChanged);
            // 
            // btnKripto
            // 
            this.btnKripto.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnKripto.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnKripto.Location = new System.Drawing.Point(207, 491);
            this.btnKripto.Name = "btnKripto";
            this.btnKripto.Size = new System.Drawing.Size(189, 23);
            this.btnKripto.TabIndex = 11;
            this.btnKripto.Text = "&Kripto";
            this.btnKripto.Click += new System.EventHandler(this.btnKripto_Click);
            // 
            // groupBox2
            // 
            this.groupBox2.Controls.Add(this.txtTekstiDekriptuar);
            this.groupBox2.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.groupBox2.Location = new System.Drawing.Point(11, 437);
            this.groupBox2.Name = "groupBox2";
            this.groupBox2.Size = new System.Drawing.Size(714, 48);
            this.groupBox2.TabIndex = 13;
            this.groupBox2.TabStop = false;
            this.groupBox2.Text = "Teksti i dekriptuar";
            // 
            // txtTekstiDekriptuar
            // 
            this.txtTekstiDekriptuar.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.txtTekstiDekriptuar.Location = new System.Drawing.Point(4, 18);
            this.txtTekstiDekriptuar.Multiline = true;
            this.txtTekstiDekriptuar.Name = "txtTekstiDekriptuar";
            this.txtTekstiDekriptuar.ReadOnly = true;
            this.txtTekstiDekriptuar.Size = new System.Drawing.Size(704, 24);
            this.txtTekstiDekriptuar.TabIndex = 9;
            // 
            // btnDekripto
            // 
            this.btnDekripto.Enabled = false;
            this.btnDekripto.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnDekripto.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDekripto.Location = new System.Drawing.Point(402, 491);
            this.btnDekripto.Name = "btnDekripto";
            this.btnDekripto.Size = new System.Drawing.Size(189, 23);
            this.btnDekripto.TabIndex = 12;
            this.btnDekripto.Text = "&Dekripto";
            this.btnDekripto.Click += new System.EventHandler(this.btnDekripto_Click);
            // 
            // btnParamRSATeRi
            // 
            this.btnParamRSATeRi.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnParamRSATeRi.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnParamRSATeRi.Location = new System.Drawing.Point(12, 491);
            this.btnParamRSATeRi.Name = "btnParamRSATeRi";
            this.btnParamRSATeRi.Size = new System.Drawing.Size(189, 23);
            this.btnParamRSATeRi.TabIndex = 10;
            this.btnParamRSATeRi.Text = "Gjenero parametra të &ri";
            this.btnParamRSATeRi.Click += new System.EventHandler(this.btnParamRSATeRi_Click);
            // 
            // btnMbyll
            // 
            this.btnMbyll.Enabled = false;
            this.btnMbyll.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnMbyll.Font = new System.Drawing.Font("Courier New", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnMbyll.Location = new System.Drawing.Point(597, 491);
            this.btnMbyll.Name = "btnMbyll";
            this.btnMbyll.Size = new System.Drawing.Size(129, 23);
            this.btnMbyll.TabIndex = 14;
            this.btnMbyll.Text = "Mbyll";
            this.btnMbyll.Click += new System.EventHandler(this.btnMbyll_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 19F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Yellow;
            this.ClientSize = new System.Drawing.Size(734, 522);
            this.Controls.Add(this.btnMbyll);
            this.Controls.Add(this.btnKripto);
            this.Controls.Add(this.groupBox2);
            this.Controls.Add(this.btnDekripto);
            this.Controls.Add(this.btnParamRSATeRi);
            this.Controls.Add(this.groupBox3);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.groupBox4);
            this.Controls.Add(this.groupBox5);
            this.Font = new System.Drawing.Font("Consolas", 9.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.ForeColor = System.Drawing.SystemColors.MenuText;
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "RSA";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.groupBox5.ResumeLayout(false);
            this.groupBox5.PerformLayout();
            this.groupBox3.ResumeLayout(false);
            this.groupBox3.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            this.groupBox4.ResumeLayout(false);
            this.groupBox4.PerformLayout();
            this.groupBox2.ResumeLayout(false);
            this.groupBox2.PerformLayout();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.GroupBox groupBox5;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtq;
        private System.Windows.Forms.TextBox txtp;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txte;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtd;
        private System.Windows.Forms.GroupBox groupBox3;
        private System.Windows.Forms.TextBox txtTekstiKriptuar;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.TextBox txtTekstiPerKriptim;
        private System.Windows.Forms.GroupBox groupBox4;
        private System.Windows.Forms.TextBox txtTekstiKriptuarByteArray;
        private System.Windows.Forms.Button btnKripto;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.TextBox txtTekstiDekriptuar;
        private System.Windows.Forms.Button btnDekripto;
        private System.Windows.Forms.Button btnParamRSATeRi;
        private System.Windows.Forms.Button btnMbyll;
    }
}

