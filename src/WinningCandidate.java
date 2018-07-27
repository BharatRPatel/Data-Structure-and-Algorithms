public class WinningCandidate {

    public static void main(String args[]){

        int a[] = new int[] {1,2,2,2,2,3,3,3,4,4};
        int currentCandidate=a[0], maxCandidate=a[0], currentCounter=1, maxCounter=1;

        for(int i=1;i<a.length;i++){
            if(a[i] == currentCandidate){
                currentCounter++;

            } else {

                currentCandidate = a[i];
                currentCounter=1;
            }

            if (currentCounter > maxCounter){

                maxCounter = currentCounter;
                maxCandidate = currentCandidate;
            }


        }


        System.out.println("Max Candidate is " + maxCandidate);


    }


}
