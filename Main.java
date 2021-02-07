
package omegaup01;

import java.util.Scanner;

class Main {
    
    static Scanner Sc = new Scanner(System.in);
    static int C1 = 0;
    static int C2 = 0;
    static int N = 0;
    static int N1 = 0;
    static int N2 = 0;
    
    public static void main(String[] args) {
        P1229();
    }
    
    // 11456. Vector dominante
    // https://omegaup.com/arena/problem/Vector-dominante/#problems
    public static void P11456(){
        int n = 0;
        n = Sc.nextInt();
        int [] v1 = new int[n];
        int [] v2 = new int[n];
        
        for(int i = 0; i < n; i++){
            v1[i] = Sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            v2[i] = Sc.nextInt();
        }
        int f = 1;
        for(int i = 0; i < n; i++){
            if(v1[i] < v2[i]) f = 0;
        }
        System.out.println("" + f);
    }
    
    // 11455. Filtrando múltiplos
    // https://omegaup.com/arena/problem/Filtrando-multiplos/
    public static void P11455(){
        int n = 0;
        n = Sc.nextInt();
        int N = 0;
        int [] v = new int[n];
        
        for(int i = 0; i < n; i++){
            v[i] = Sc.nextInt();
        }
        
        N = Sc.nextInt();
        
        for(int i = 0; i < n; i++){
            if(v[i] % N != 0){
                if( i != (n - 1)){
                    System.out.print("X ");
                }else{
                    System.out.print("X");
                }
            }else{
                if( i != (n - 1)){
                    System.out.print(v[i] + " ");
                }else{
                    System.out.print("" + v[i]);
                }
            }
        }
    }
    
    // 11453. Producto punto de dos vectores
    // https://omegaup.com/arena/problem/Producto-punto-de-dos-vectores/
    public static void P11453(){
        int n = 0;
        n = Sc.nextInt();
        int [] v1 = new int[n];
        int [] v2 = new int[n];
        
        for(int i = 0; i < n; i++){
            v1[i] = Sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            v2[i] = Sc.nextInt();
        }
        int S = 0;
        for(int i = 0; i < n; i++){
            S += v1[i] * v2[i];
        }
        System.out.println("" + S);
    }
    
    // 11427. Coincidencias de una cadena con su reverso
    // https://omegaup.com/arena/problem/Coincidencias-de-una-cadena-con-/
    public static void P11427(){
        String c = "";
        c = Sc.next();
        int L = c.length() - 1;
        int S = 0;
        for(int i = 0; i < c.length(); i++){
            if(c.toLowerCase().charAt(i) == c.toLowerCase().charAt(L)){
                ++S;
            }
            --L;
        }
        System.out.println("" + S);
    }
    
    // 11339. Conteos básicos
    // https://omegaup.com/arena/problem/Conteos-basicos/
    public static void P11339(){
        int A, B;
        A = B = 0;
        
        A = Sc.nextInt();
        B = Sc.nextInt();
        for(int i = A; i <= B; i++){
            System.out.println("" + i);
        }
    }
    
    // 11264. Numeros naturales
    // https://omegaup.com/arena/problem/Numeros-naturales-UAM-PE/
    public static void P11264(){
        int A, B;
        A = B = 0;
        
        A = Sc.nextInt();
        B = Sc.nextInt();
        for(int i = A; i <= B; i++){
            if(i != B){
                System.out.print(i + " ");
            }else{
                System.out.print("" + i);
            }
        }
    }
    
    // 11266. Multiplos dentro de un intervalo
    // https://omegaup.com/arena/problem/MDUI-UAMA/
    public static void P11266(){
        int A, B;
        A = B = 0;
        
        A = Sc.nextInt();
        B = Sc.nextInt();
        for(int i = A; i <= B; i++){
            if(i % A == 0){
                System.out.print(i + " ");
            }
        }
    }
    
    // 10288. Días a segundos
    // https://omegaup.com/arena/problem/Dias-a-segundos/
    public static void P10288(){
        int Dias = Sc.nextInt();
        
        int Segundos = Dias * 24 * 60 * 60;
        
        System.out.println("" + Segundos);
    }
    
    // Factorial hasta 20
    // https://omegaup.com/arena/problem/Factorial-hasta-el-20/#problems
    public static void Factorial20(){
        int n = Sc.nextInt();
        int Fac = 1;
        
        while(n != 0){
            Fac *= n;
            n--;
        }
        System.out.print(Fac + "");
    }
    
    // 4331. Formula Recursiva Uno
    // https://omegaup.com/arena/problem/Formula-Recursiva-Uno/#problems
    public static int FormulaFac1(int n){
        if(n <= 5){
            return 1;
        }else{
            return FormulaFac1(n - 2) * 5;
        }
    }
    
    // 6485. Fibonacci recursivo
    // https://omegaup.com/arena/problem/Fibonacci-recursivo/
    public static int Fibonacci(int n){
        C1++;
        if(n < 2){
            return n;
        }else{
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
    
    // 5097. Lanzamiento de moneda
    // https://omegaup.com/arena/problem/Lanzamiento-de-moneda/#problems
    public static void Lanzamiento(){
        N = Sc.nextInt();
        int v = 1;
        for(int i = 0; i < N; i++){v *= 2;}
        for(int i = 0; i < v; i++){
            Combinacion(i, N);
            System.out.println("");
        }
    }
    public static void Combinacion(int i, int n){
        if(n == 0) return;
        char c;
        c = n%2 == 1 ? 'X' : 'A';
        Combinacion(i / 2, n - 1);
        System.out.print("" + c);
    }
    
    //
    //
    public static void Palindromos(){
        String Cad = "";
        N = Sc.nextInt();
        String [] C = new String[N];
        for(int i = 0; i < N; i++){
            C[i] = Cad = Sc.next();
        }
        
        boolean Es = true;
        for(int j = 0; j < N; j++){
            Cad = C[j].toLowerCase();
            Es = true;
            for(int i = 0; i < Cad.length(); i++){
                if(Cad.charAt(i) == Cad.charAt(Cad.length() - i - 1)){
                }else{
                    Es = false;
                }
            }
            if(Es){
                System.out.println("Si");
            }else{
                System.out.println("No");
            }
        }
    }
    
    
    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    //////////////////////////BUSQUEDA////////////////////////////
    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    
    // 2469. Valor Absoluto
    // https://omegaup.com/arena/problem/GPC1F/#problems
    public static void P2469(){
        Scanner Sc = new Scanner(System.in);
        int A = Sc.nextInt();
        int B = Sc.nextInt();
        
        System.out.println("" + Math.abs( A + B ));
    }
    
    
    
    
    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    //////////////////////U5 ORDENAMIENTO/////////////////////////
    //////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////
    
    
    // 3981. Ordena Básico 2
    // https://omegaup.com/arena/problem/Ordena-Basico-2/
    public static void P3981(){
        N = Sc.nextInt();
        int [] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = Sc.nextInt();
        }
        Radix(Arr);
    }
    
    // 10688. Ordenamiento Vector Enteros
    // https://omegaup.com/arena/problem/Ordenamiento-Vector-Enteros/
    public static void P10688(){
        N = Sc.nextInt();
        int [] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = Sc.nextInt();
        }
        Radix(Arr);
    }
    
    // 7343. Ordenar de mayor a menor tres números
    // https://omegaup.com/arena/problem/Ordenar-Mayor-a-menor-3-numeros/
    public static void P7343(){
        int n1, n2, n3;
        int aux1, aux2;
        n1 = n2 = n3 = 0;
        aux1 = aux2 = 0;
        n1 = Sc.nextInt();
        n2 = Sc.nextInt();
        n3 = Sc.nextInt();
        if(n2 > n1){
            aux1 = n1;
            n1 = n2;
            n2 = aux1;
        }
        if(n3 > n2){
            aux1 = n2;
            n2 = n3;
            n3 = aux1;
        }
        if(n2 > n1){
            aux1 = n1;
            n1 = n2;
            n2 = aux1;
        }
        
        System.out.println("" + n1);
        System.out.println("" + n2);
        System.out.println("" + n3);
    }
    
    // 773. 1 Ordena a los alumnos
    // https://omegaup.com/arena/problem/1-Ordena-un-arreglo/
    public static void P773(){
        N = Sc.nextInt();
        int [] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = Sc.nextInt();
        }
        Radix(Arr);
    }
    
    // 2797. Ordenando Dígitos
    // https://omegaup.com/arena/problem/Ordenando-Digitos/
    public static void P2797(){
        N = Sc.nextInt();
        int [] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = Sc.nextInt();
        }
        Radix(Arr);
    }
    
    // 12053. Ordenando por magnitud
    // https://omegaup.com/arena/problem/Ordenando-por-magnitud/#problems
    public static void P12053(){
        N = Sc.nextInt();
        int [] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = Sc.nextInt();
        }
        RadixAbs(Arr);
    }
    
    // 12054. Ordenando por distancia al origen
    // https://omegaup.com/arena/problem/Ordenando-por-distancia-al-orige/
    
    // 1229. Ordenar
    // https://omegaup.com/arena/problem/Ordenar/
    public static void P1229(){
        N = Sc.nextInt();
        int [] Arr = new int[N];
        for(int i = 0; i < N; i++){
            Arr[i] = Sc.nextInt();
        }
        Radix(Arr);
    }
    
    // 9454. Duplicados y ordenamiento
    // https://omegaup.com/arena/problem/Duplicados-y-ordenamiento/
    public static void P9454(){
        N = Sc.nextInt();
        int [] Arr = new int[N];
        int [] Arr2 = new int[N];
        for(int i = 0; i < N; i++){
            Arr2[i] = 0;
            Arr[i] = Sc.nextInt();
        }
        N1 = 0;
        boolean Existe = false;
        for(int i = 0; i < N; i++){
            Existe = false;
            for(int j = 0; j < N; j++){
                if(Arr2[i] == Arr[j]){
                    Existe = true;
                }
            }
            if(!Existe){
                Arr2[N1] = Arr[i];
                ++N1;
            }
        }
        int [] Arr3 = new int[N1];
        for(int i = 0; i < N1; i++)
        Radix(Arr3);
    }
    
    public static void RadixAbs(int [] Arr){
        int x, i , j;
        for(x = Integer.SIZE - 1; x>= 0; x--){
            int Aux[] = new int[Arr.length];
            j = 0;
            for(i = 0; i < Arr.length; i++){
                boolean Mover = Math.abs(Arr[i]) << x >= 0;
                if(x == 0 ? !Mover : Mover){
                    Aux[j] = Arr[i];
                    j++;
                }else{
                    Arr[i - j] = Arr[i];
                }
            }
            for(i = j; i < Aux.length; i++){
                Aux[i] = Arr[i - j];
            }
            Arr = Aux;
        }
        MostrarArreglo(Arr);
    }
    public static void Radix(int [] Arr){
        int x, i , j;
        for(x = Integer.SIZE - 1; x>= 0; x--){
            int Aux[] = new int[Arr.length];
            j = 0;
            for(i = 0; i < Arr.length; i++){
                boolean Mover = Arr[i] << x >= 0;
                if(x == 0 ? !Mover : Mover){
                    Aux[j] = Arr[i];
                    j++;
                }else{
                    Arr[i - j] = Arr[i];
                }
            }
            for(i = j; i < Aux.length; i++){
                Aux[i] = Arr[i - j];
            }
            Arr = Aux;
        }
        MostrarArreglo(Arr);
    }
    
    public static void MostrarArreglo(int [] Arr){
        for(int i = 0; i < Arr.length; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println("");
    }
    public static void MostrarArregloInv(int [] Arr){
        for(int i = Arr.length - 1; i >= 0 ; i--){
            System.out.println("" + Arr[i]);
        }
        System.out.println("");
    }
    
}

