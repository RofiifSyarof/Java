// contoh selection sort
/////////////////////////////////////////////////////////////////////////

class latSelectSort {
	// Status atau atribut dari kelas
	private long[] a; // array a dengan tipe data long
	private int nElemen; // jumlah elemen array
	
//----------------------------------------------------------------------

	public latSelectSort(int max) { // constructor
		a = new long[max]; // menciptakan array
		nElemen = 0; // elemen array masih kosong
	}
	
//----------------------------------------------------------------------

	// Behaviour atau method untuk memasukkan data
	public void input(long data) {
		a[nElemen] = data; // memasukkan data
		nElemen++; // jumlah elemen array bertambah satu
	} // end input()
	
//----------------------------------------------------------------------

	// Behaviour atau method untuk menampilkan data
	public void tampil() { // menampilkan isi array
		for(int i=0; i<nElemen; i++)
		System.out.print(a[i] + " ");
		System.out.println("");
	} // end tampil()
	
//----------------------------------------------------------------------
	
	public void selectionSort() {
		int i,j,indek;
		for(i=0; i<nElemen-1; i++) { // perulangan pertama untuk mengulangi perbandingan dari awal lagi
			indek=i; // indek merujuk pada data ke-i
			for(j=i+1; j<nElemen; j++) // perulangan kedua untuk membandingkan data
				if(a[indek] > a[j] ) // jika data indek > data j
					indek=j; // tukar indek dengan data yang lebih kecil (j)
			tukar(i,indek); // penukaran data
		} // end for(i)
	} // end selectionSort()
	
//----------------------------------------------------------------------

	// method untuk melakukan pertukaran tempat
	private void tukar(int data1, int data2) {
		long temp = a[data1];
		a[data1] = a[data2];
		a[data2] = temp;
	} //end tukar()

//----------------------------------------------------------------------
} // end class latSelectSort
	
/////////////////////////////////////////////////////////////////////////	

class selectSort {
	public static void main(String[] args) {
		int makArray = 100; // maksimum elemen array 100
		latSelectSort larik;
		larik = new latSelectSort(makArray);
				
		larik.input(57); // memasukkan data
		larik.input(89);
		larik.input(49);
		larik.input(51);
		larik.input(12);
		larik.input(90);
		larik.input(1);
		larik.input(0);
		larik.input(63);
		larik.input(25);
		
		larik.tampil(); // menampilkan data array
		larik.selectionSort();		
		larik.tampil();
	
	} // end main()
} // end arrayClass