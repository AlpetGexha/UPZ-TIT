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

            // byte[] Tedhenat = { 40, 45, 68, 79, 01, 60, 31, 31, 23, 123};
            // 40, 45, 68, 79, 01, 60, 31, 31, 23, 123
            // ask user for input
            while (true)
            {

                Console.Write("Shkruani te dhenat per te bere hash (12,31,32...): ");
                string input = Console.ReadLine();
                byte[] Tedhenat = Encoding.UTF8.GetBytes(input);



                byte[] hashi = hash.ComputeHash(Tedhenat);

                Console.Write("Hashi:" + BitConverter.ToString(hashi));
                Console.WriteLine();

                // ask user if they want to continue
                Console.Write("Deshironi te vazhdoni (po/jo)? ");
                string pergjigja = Console.ReadLine();

                if (pergjigja.ToLower() != "po")
                {
                    break;
                }
            }

            //Console.Write("Per te perfunduar shtyp Enter...");
            //Console.Read();
        }
    }
}
