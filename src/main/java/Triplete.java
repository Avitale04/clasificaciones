public class Triplete {

    public int []A;
    int dato1 = 0;
    int dato2 = 0;
    int dato3 = 0;
    int igualesPrimerDato = 0;
    int igualesSegundoDato = 0;

    public Triplete(int []A){
        this.A = A;
    }

    public void primerValor(){

        boolean primerDato = false;

        for (int i =0;i<= A.length-1;i++){

            System.out.print(A[i] + ", "); //se recorre el array

            if(A[i] >= dato1 && primerDato){

                if(A[i] == dato1){
                    igualesPrimerDato++;
                }

                if(A[i] > dato1){
                    igualesPrimerDato = 0;
                }

                dato1 = A[i];
            }
            if(!primerDato){
                dato1 = A[i]; primerDato = true;
            }
        }

        System.out.println(" ");
        System.out.println("Dato 1 = "+dato1);
        System.out.println("iguales  = "+ igualesPrimerDato);
    }

    public void segundoValor(){

        boolean primerDato = false;

        if(igualesPrimerDato>0){
            dato2 = dato1;

        }else{

            for (int i =0;i<= A.length-1;i++){

                if(A[i]<dato1 && A[i]>=dato2 && primerDato){

                    if(A[i] == dato2){
                        igualesSegundoDato++;
                    }

                    if(A[i] > dato2){
                        igualesSegundoDato = 0;
                    }

                    dato2 = A[i];
                }

                if(!primerDato && A[i]<dato1){
                    dato2 = A[i];  primerDato = true;
                }
            }

        }
        System.out.println(" ");
        System.out.println("Dato 2 = "+ dato2);
        System.out.println("iguales = " + igualesSegundoDato);


    }

    public void tercerValor(){

        boolean primerDato = false;

        if(igualesPrimerDato>1 || igualesSegundoDato>0){

            if(igualesPrimerDato>1){dato3 = dato1;}else {dato3 = dato2;}

        }else{

            for (int i =0;i<= A.length-1;i++){

                if(A[i]<dato1 && A[i]<dato2 && A[i] > dato3 && primerDato){

                    dato3 = A[i];
                }

                if(!primerDato && A[i]<dato2 && A[i] < dato2){

                    dato3 = A[i];  primerDato = true;
                }
            }

        }

        System.out.println(" ");
        System.out.println("Dato 3 = "+ dato3);


    }

}
