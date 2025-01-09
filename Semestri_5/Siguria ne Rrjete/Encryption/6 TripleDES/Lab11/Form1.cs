using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab11
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           
        }

        private void btnEncrypt_Click(object sender, EventArgs e)
        {
            //memanggil class tripleDES.encrypt
            textEncrypt.Text = TripleDES.Encrypt(textPlain.Text, textKey.Text);
        }

        private void btnDecrypt_Click(object sender, EventArgs e)
        {
            //memanggil class tripleDES.decrypt
            textDecrypt.Text = TripleDES.Decrypt(textEncrypt.Text, textKey.Text);
        }


    }
}
