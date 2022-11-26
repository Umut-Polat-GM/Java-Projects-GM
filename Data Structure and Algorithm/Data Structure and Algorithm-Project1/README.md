# Proje 1 Cevapları

Bu dosya Patika.dev tarafından hazırlanan veri Yapıları ve Algoritmalar dersleri sonunda uygulama projelerinin cevaplarıdır.

![proje1](https://github.com/Umutpltf/Veri-Yap-lar-ve-Algoritmalar-Proje1/blob/24e8b6a266a0c8d0a9d7820e866673b5f233ea95/Project%201.png)

## Cevap 1
1. * [22,27,16,2,18,6] n
   * [2,27,16,22,18,6] (n-1)
   * [2,6,16,22,18,27] (n-2)
   * [2,6,16,22,18,27] (n-3)
   * [2,6,16,18,22,27] (n-4)
   * [2,6,16,18,22,27] (n-5)
   * [2,6,16,18,22,27] 1

2. O(n^2)

3. * Best-case: Aradığınız değerin 22 olması bu algoritmanın best-case’dir. Çünkü daha ilk iterasyonda aradığımız değere ulaşmış oluruz.
   * Average-case: Bu case, verilen input setindeki değerlerin dizi içerisindeki dağılımına göre belirlenir. Bu örnek için average-case aradığımız değerin, dizi’nin  ortasına yakın ve sol taraftaki , yani 16 değerinin olması olabilir.
   * Worst-case: Bu örneğimiz için worst-case, yani en kötü durum senaryosu, aradığımız değerin dizinin en sondaki değer olması durumudur. Bu örnek için bu değer 6'dir.

   

4. * Worst-case: çünkü aranan sayının ortanın sağında olması solunda olmasına göre daha uzun süre aldığı için ve avarage-case de 16 olarak belirlediğimiz için 18 değeri worst-case olur.



* [7,3,5,8,2,9,4,15,6] n
* [2,3,5,8,7,9,4,15,6] (n-1)
* [2,3,5,8,7,9,4,15,6] (n-2)
* [2,3,4,8,7,9,5,15,6] (n-2)

