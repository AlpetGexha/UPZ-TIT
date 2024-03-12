using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Security.Cryptography;

namespace ShembulliHash
{
    class Program
    {
        static void Main(string[] args)
        {
            HashAlgorithm hash = HashAlgorithm.Create();

            Console.Write("Madhesia e hash ne bita: ");
            Console.WriteLine(hash.HashSize.ToString() + " bita");
            Console.Write("Madhesia e hash ne bajta: ");
            Console.WriteLine((hash.HashSize / 8).ToString() + " bajta");

            byte[] Tedhenat = { 40, 45, 68, 79, 01, 60};

            byte[] hashi = hash.ComputeHash(Tedhenat);

            Console.Write("Hashi:" + BitConverter.ToString(hashi));
            Console.WriteLine();

            Console.Write("Per te perfunduar shtyp Enter...");
            Console.Read();
        }
    }
}
