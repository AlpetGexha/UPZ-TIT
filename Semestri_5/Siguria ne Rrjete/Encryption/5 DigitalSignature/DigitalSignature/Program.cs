using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Security.Cryptography;
using System.IO;
using System.Text;

namespace DigitalSignature
{
    class Program
    {
        static void Main(string[] args)
        {
            DSACryptoServiceProvider dsaA = new DSACryptoServiceProvider();
            DSACryptoServiceProvider dsaB = new DSACryptoServiceProvider();

            //krijimi i tekstit i cili do te nenshkruhet
            string tekstiorigjinal = "AlpetGexha";

            Console.WriteLine("\nTeksti origjinal: " + tekstiorigjinal);


            UTF8Encoding enk = new UTF8Encoding();
            byte[] OrigjinaleNeBajt = enk.GetBytes(tekstiorigjinal);

            Console.WriteLine("\nTeksti ne bajta: " + BitConverter.ToString(OrigjinaleNeBajt));




            //krijimi i hash kodit per tekstin e krijuar
            //dhe nenshkrimi i tyre.
            byte[] HashiNenshkruar = dsaA.SignData(OrigjinaleNeBajt, 0, tekstiorigjinal.Length);

            Console.WriteLine("\nHashi i nenshkruar: " + BitConverter.ToString(HashiNenshkruar) + "\n\n");


            //Eksportimi i celsit publik
            string celesipublik = dsaA.ToXmlString(false);


            //Importimi i celesit publik
            dsaB.FromXmlString(celesipublik);

            //krijimi i tekstit i cili do te nenshkruhet
            string tekstiPranuar = "AlpetGexha";

            Console.WriteLine("\nTeksti origjinal: " + tekstiPranuar);


            UTF8Encoding enk1 = new UTF8Encoding();
            byte[] PranuarNeBajt = enk.GetBytes(tekstiPranuar);

            Console.WriteLine("\nTeksti ne bajta: " + BitConverter.ToString(PranuarNeBajt));
            byte[] HashiNenshkruar1 = dsaA.SignData(PranuarNeBajt, 0, tekstiPranuar.Length);

            Console.WriteLine("\nHashi i nenshkruar: " + BitConverter.ToString(HashiNenshkruar1) + "\n\n");

            if (dsaB.VerifyData(PranuarNeBajt, HashiNenshkruar))
            {
                Console.WriteLine("SUKSES: Eshte vertetuar nenshkrimi");
            }
            else
            {
                Console.WriteLine("GABIM: Neshkrimi nuk u verifikua");
            }

            Console.Write("\nPer te perfunduar shtyp ENTER ...");
            Console.Read();

        }
    }
}
