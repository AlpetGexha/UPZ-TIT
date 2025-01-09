using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//menambah namespace untuk enkripsi
using System.Security.Cryptography;

namespace Lab11
{
    public class TripleDES
    {
        public static string Encrypt(string plain, string key)
        {
            //membuat class baru TripleDES
            using (TripleDESCryptoServiceProvider tds = new TripleDESCryptoServiceProvider())
            {
                //class md5
                using (MD5CryptoServiceProvider hashMD5Provider = new MD5CryptoServiceProvider())
                {
                    //mendapat key
                    byte[] byteHash = hashMD5Provider.ComputeHash(Encoding.UTF8.GetBytes(key));
                    tds.Key = byteHash;
                    tds.Mode = CipherMode.ECB;
                    //mendapat plaintext
                    byte[] data = Encoding.Unicode.GetBytes(plain);
                    return Convert.ToBase64String(tds.CreateEncryptor().TransformFinalBlock(data, 0, data.Length));
                }
            }
        }

        public static string Decrypt(string encrypt, string key)
        {
            using (TripleDESCryptoServiceProvider tds = new TripleDESCryptoServiceProvider())
            {
                using (MD5CryptoServiceProvider hashMD5Provider = new MD5CryptoServiceProvider())
                {
                    //mendapat key
                    byte[] byteHash = hashMD5Provider.ComputeHash(Encoding.UTF8.GetBytes(key));
                    tds.Key = byteHash;
                    tds.Mode = CipherMode.ECB;
                    //mendapat encrypt text
                    byte[] byteBuff = Convert.FromBase64String(encrypt);
                    return Encoding.Unicode.GetString(tds.CreateDecryptor().TransformFinalBlock(byteBuff, 0, byteBuff.Length));
                }
            }
        }
        
        
    }
}
