Console.WriteLine("Hello, wellcome to penjumlahan!");
using System;
class program
{
    static void Main(string[] args)
    {
        Console.WriteLine(1);
        double angka1 = Convert.ToDouble(Console.ReadLine);

        Console.WriteLine(2);
        double angka2 = Convert.ToDouble (Console.ReadLine);

        Console.WriteLine(Pilih operasi (+, -, *, /):);
        char operasi = Console.ReadKey().KeyChar:
        Console.WriteLine();

        double hasil = 0;

        switch (operasi)
        {
            case '+':
            hasil = angka1 + angka2;
            break
            case '-':
            hasil = angka1 - angka2;
            break
            case '*':
            hasil = angka1 * angka2;
            break
            case '/':
            if (angka2 != 0)
            {
                hasil = angka1 / angka2
            }
            else
            {
                Console.WriteLine(pembagian dengan nol tidak tidak diizinkan.);
                return;
            }
            break;
        default:
            Console.WriteLine(operasi tidak dikenali.);
            return;
        } 

        Console.WriteLine($hasil: {hasil});
    }
}