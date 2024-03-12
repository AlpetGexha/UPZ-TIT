using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

using System.IO;
using System.Security.Cryptography;

namespace Kodi_i_cezarit_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        static string celesi;

        
        private void btnEnkripto_Click(object sender, EventArgs e)
        {
            txtCipherText.Text = ekripto_cesar(txtOrigjinal.Text, 4);
        }
        private void btnDekripto_Click(object sender, EventArgs e)
        {
            txtCipherText.Text = dekripto_cesar(txtOrigjinal.Text, 4);
        }
        private void btnDil_Click(object sender, EventArgs e)
        {
            Close();
        }
        public static string ekripto_cesar(string teksti, int zhvendosja)
        {
            StringBuilder sb = new StringBuilder();
            foreach (char shkronja in teksti.ToLower())
            {
                int vlera_enk = 2;
                if (shkronja == ' ')
                {
                    vlera_enk = ' ';
                }
                else
                {
                    vlera_enk = (((shkronja - 'a') + zhvendosja) % 26) + 'a';
                }
                sb.Append((char)vlera_enk);
            }
            return sb.ToString();
        }
        public static string dekripto_cesar(string teksti, int zhvendosja)
        {
            StringBuilder sb = new StringBuilder();
            foreach (char shkronja in teksti.ToLower())
            {
                int vlera_enk = 2;
                if (shkronja == ' ')
                {
                    vlera_enk = ' ';
                }
                else
                {
                    vlera_enk = (((shkronja - 'a') - zhvendosja) % 26) + 'a';
                }
                sb.Append((char)vlera_enk);
            }
            return sb.ToString();
        }
        private void txtOrigjinal_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtCipherText_TextChanged(object sender, EventArgs e)
        {

        }
        
    }
}
