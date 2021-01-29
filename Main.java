
package omegaup01;

import java.util.Scanner;

/**
 *
 * @author User37
 */
class Main {
    
    static Scanner Sc = new Scanner(System.in);
    static int C1 = 0;
    
    public static void main(String[] args) {
        
        int n = Sc.nextInt();
        //System.out.print("" + FormulaFac1(n));
        System.out.println("" + Fibonacci(n) + " " + C1);
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
    
    //
    //
    
    
    
    
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
    
}

