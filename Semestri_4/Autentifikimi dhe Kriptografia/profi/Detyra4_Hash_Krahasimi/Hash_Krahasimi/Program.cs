using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Security.Cryptography;
using System.Text;

namespace Hash_Krahasimi
{
    class Program
    {
        static void Main(string[] args)
        {
            HashAlgorithm Hash1 = HashAlgorithm.Create();
            HashAlgorithm Hash2 = HashAlgorithm.Create();

            string stringu1 = "Eshte nje string per testim te hashit";
            string stringu2 = "Eshte nje String per testim te hashit";

            UTF8Encoding enc = new UTF8Encoding();

            byte[] Stringu1Bajt = enc.GetBytes(stringu1);
            byte[] HashiStringut1 = Hash1.ComputeHash(Stringu1Bajt);
            Console.WriteLine("Hashi1: " + BitConverter.ToString(HashiStringut1));

            byte[] Stringu2Bajt = enc.GetBytes(stringu2);
            byte[] HashiStringut2 = Hash2.ComputeHash(Stringu2Bajt);
            Console.WriteLine("Hashi2: " + BitConverter.ToString(HashiStringut2));

            bool njejt = true;
            for (int i = 0; i < HashiStringut1.Length; i++)
            {
                if (HashiStringut1[i] != HashiStringut2[i])
                {
                    njejt = false;
                }
            }
            if (njejt)
            {
                Console.WriteLine("Hash kodet jane te njejta");
            }
            else
            {
                Console.WriteLine("Hash kodet jane te ndryshme");
            }
            Console.WriteLine();
            Console.Write("\n\nPer te perfunduar shtyp ENTER..");
            Console.Read();
        }
    }
}
