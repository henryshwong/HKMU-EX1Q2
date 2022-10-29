class NullArrayExceotion extends Exception{
    public NullArrayExceotion(String msg){
        super(msg);
    }

}

class NegativeIndexException extends Exception{
    public NegativeIndexException(String msg){
        super(msg);
    }
}

class  IndexOutofBoundsException extends  Exception{
    public  IndexOutofBoundsException(String msg){
        super(msg);
    }
}


public class Main {

    public static void swap(int [] array, int firstIndex, int secondIndex) throws
            IndexOutofBoundsException, NegativeIndexException, NullArrayExceotion{
        if (array == null) {
            throw new NullArrayExceotion("Null");
        }
        if (firstIndex<0 ||secondIndex<0){
            throw new NegativeIndexException("Negative");
        }
        if (firstIndex >= array.length ||secondIndex >= array.length){
            throw  new IndexOutofBoundsException("Index");
        }

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

    }


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = null;

        try {

//            swap(a, 1, 2);
//            swap(a,0,-3);
//            swap(a,5,0);
            swap(a,3,1);

        } catch (NullArrayExceotion e ){
        System.out.println(e.toString());
        }
        catch (IndexOutofBoundsException e ){
            System.out.println(e.getMessage());
        }
        catch (NegativeIndexException e ){
            System.out.println(e.getLocalizedMessage());
        }

        for(int x=0; x<= a.length-1; x++){
            System.out.println(a[x]);
        }


    }
}