using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Security.Cryptography;
using System.IO;


namespace WindowsFormsApplication4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        DESCryptoServiceProvider des = new DESCryptoServiceProvider();

        private void btninput_Click(object sender, EventArgs e)
        {
            OpenFileDialog dialog = new OpenFileDialog();
            dialog.Filter="txt files (*.txt)|*.txt|All files (*.*)|*.*";
            dialog.InitialDirectory = "C:";
            dialog.Title = "Zgjedhe fajllin per kriptim";

            if (dialog.ShowDialog() == DialogResult.OK)
                input.Text = dialog.FileName;
            if (input.Text == String.Empty)
                return;
        }

        public void KriptoFajllin(string pathiHyres, string pathiDales, string Key)
        {
            try
            {
                DESCryptoServiceProvider des = new DESCryptoServiceProvider();
                des.Key = Encoding.UTF8.GetBytes(Key);
                des.IV = Encoding.UTF8.GetBytes(Key);
                FileStream fs_o = new FileStream(pathiDales, FileMode.Create,FileAccess.Write);
                CryptoStream cs_write = new CryptoStream(fs_o, des.CreateEncryptor(), CryptoStreamMode.Write);

                FileStream fs_i=new FileStream(pathiHyres, FileMode.Open);

                byte[] buffer = new byte[fs_i.Length];
                fs_i.Read(buffer, 0, buffer.Length);
                cs_write.Write(buffer, 0, buffer.Length);
                cs_write.Close();
                fs_i.Close();
                fs_o.Close();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Ka ndodhur gabimi: " + ex.Message);
            }


        }

        public void DekriptimiFajllit(string pathiHyres, string pathiDales, string Key)
        {
            try
            {

                des.Key = Encoding.UTF8.GetBytes(Key);
                des.IV = Encoding.UTF8.GetBytes(Key);
                FileStream fs_i = new FileStream(pathiHyres, FileMode.Open, FileAccess.Read);
                FileStream fs_o = new FileStream(pathiDales, FileMode.Create, FileAccess.Write);
                CryptoStream cs_read = new CryptoStream(fs_i, des.CreateDecryptor(), CryptoStreamMode.Read);
                StreamReader sr = new StreamReader(cs_read);
                StreamWriter sw = new StreamWriter(fs_o);
                sw.Write(sr.ReadToEnd());
                sw.Flush();
                fs_i.Close();
                fs_o.Close();

            }
            catch (Exception ex)
            {
                MessageBox.Show("Ka ndodhur gabimi: " + ex.Message);
            }

 
        }

        private void btnoutput_Click(object sender, EventArgs e)
        {
            OpenFileDialog dialog = new OpenFileDialog();
            dialog.Filter = "txt files (*.txt)|*.txt|All files (*.*)|*.*";
            dialog.InitialDirectory = "C:";
            dialog.Title = "Zgjedhe fajllin per kriptim";

            if (dialog.ShowDialog() == DialogResult.OK)
                ouptut.Text= dialog.FileName;
            if (ouptut.Text == String.Empty)
            {
                MessageBox.Show("Procesi u nderpre nga shfrytezuesi", "System info ...");
                return;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            KriptoFajllin(input.Text, ouptut.Text, textBox1.Text);
            MessageBox.Show("Procesi i kriptimit u krye me sukses");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            DekriptimiFajllit(input.Text, ouptut.Text, textBox1.Text);
        }

        private void input_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void ouptut_TextChanged(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}
