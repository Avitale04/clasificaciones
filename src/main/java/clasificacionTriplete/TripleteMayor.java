package clasificacionTriplete;

public class TripleteMayor {

    int dato1 = 0;
    int dato2 = 0;
    int dato3 = 0;
    int igualesPrimerDato = 0;
    int igualesSegundoDato = 0;

    VerificarMayor verificarMayor;

    public TripleteMayor( VerificarMayor verificarMayor ) {

        this.verificarMayor = verificarMayor;

    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    public int primerValor(int []A){

        boolean primerDato = false;

        for (int i =0;i<= A.length-1;i++){
            if(this.verificarMayor.numeroMayorIgual(A[i],dato1) && primerDato){
                if(A[i] == dato1){igualesPrimerDato++;}
                if(this.verificarMayor.numeroMayor(A[i], dato1)){igualesPrimerDato = 0;}
                dato1 = A[i];
            }
            if(!primerDato){dato1 = A[i]; primerDato = true;}
        }
        return dato1;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public int segundoValor(int []A){

        boolean primerDato = false;

        if(igualesPrimerDato>0){dato2 = dato1;}
        else{
            for (int i =0;i<= A.length-1;i++){
                if(this.verificarMayor.numeroMenor(A[i],dato1) && this.verificarMayor.numeroMayorIgual(A[i],dato2) && primerDato){
                    if(A[i] == dato2){igualesSegundoDato++;}
                    if(this.verificarMayor.numeroMayor(A[i], dato2)){igualesSegundoDato = 0;}
                    dato2 = A[i];
                }
                if(!primerDato && this.verificarMayor.numeroMenor(A[i],dato1)){dato2 = A[i];  primerDato = true;}
            }
        }
        return dato2;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////

    public int tercerValor(int []A){

        boolean primerDato = false;

        if(igualesPrimerDato>1 || igualesSegundoDato>0){
            if(igualesPrimerDato>1){dato3 = dato1;}else {dato3 = dato2;}
        }else{
            for (int i =0;i<= A.length-1;i++){
                if(this.verificarMayor.numeroMenor(A[i],dato1) && this.verificarMayor.numeroMenor(A[i],dato2) && this.verificarMayor.numeroMayor(A[i], dato3) && primerDato){dato3 = A[i];}
                if(!primerDato && this.verificarMayor.numeroMenor(A[i],dato2)){
                    dato3 = A[i];  primerDato = true;
                }
            }
        }
     return dato3;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////

    public int resultado(int primero,int segundo, int tercero){
        int multi = primero*segundo*tercero;
        return multi;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////

}
