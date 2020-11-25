public class Triple {

    public int []A;
    int dato1 = 0;
    int dato2 = 0;
    int dato3 = 0;

    int resultado1 = 0;
    int resultado2 = 0;

    boolean repetidoDato1 = false;
    boolean repetidoDato2 = false;

    boolean verificado1 = false;
    boolean verificado2 = false;

    public Triple(int []A){
        this.A = A;
    }

    public void PrimerosDos(){

        for(int i = 0; i<= A.length-1;i++){

            for (int x = i+1; x<= A.length -1; x++){

                if(A[i] * A[x] > resultado1){

                    dato1 = A[i];
                    dato2 = A[x];
                    resultado1 = dato1 * A[x];
                }
            }
        }

        for(int y = 0; y<= A.length-1;y++){

                if (dato1 == A[y] && repetidoDato1){repetidoDato1 = false; verificado1 = true;}
                if (dato1 == A[y] && !verificado1 ){repetidoDato1 = true;}

                if (dato2 == A[y] && repetidoDato2 ){repetidoDato2 = false; verificado2 = true;}
                if (dato2 == A[y] && !verificado2){repetidoDato2 = true;}

                if(A[y]==dato1 && verificado1 && A[y] * resultado1 > resultado2 || A[y]==dato2
                    && verificado2 && A[y] * resultado1 > resultado2 || A[y] != dato1 && A[y] != dato2 && A[y] * resultado1 > resultado2){
                    dato3 = A[y];
                    resultado2 = dato3 * resultado1;
                }
        }
        System.out.println("El dato1 es = " +dato1);
        System.out.println("El dato2 es = " +dato2);
        System.out.println("El dato3 final es = " +dato3);
        System.out.println("El segundo resultado final es = "+resultado2);
    }
}


