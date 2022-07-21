package session10.tryCatchExamples;
class ListOfNumbers {
    public int[] arr = new int[10];

    public void writeList() {

        try {
            arr[10] = 11;
        }


        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Either ArrayIndexOutOfBoundsException or NumberFormatException occured => " + e.getMessage());
        }

        /*
        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }

        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("ArrayIndexOutOfBoundsException => " + e2.getMessage());
        }

         */


        /*
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            String fullClassName = e.getClass().getName();
            String shortClassName = fullClassName.substring(fullClassName.lastIndexOf(".") + 1,
                    fullClassName.length());
            switch (shortClassName){
                case "ArrayIndexOutOfBoundsException":  {
                    System.out.println("ArrayIndexOutOfBoundsException => " + e.getMessage());
                    break;
                }
                case "NumberFormatException":  {
                    System.out.println("NumberFormatException => " + e.getMessage());
                    break;
                }
                default: {System.out.println("Unprecticted exception occured => " + e.getMessage());}
            }
        } */

        /*
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("ArrayIndexOutOfBoundsException => " + e.getMessage());
            } else if (e instanceof NumberFormatException) {
                System.out.println("NumberFormatException => " + e.getMessage());
            }
            else {
                System.out.println("Unprecticted exception occured => " + e.getMessage());}
            }
        }
        */


}

class MultipleExceptions {
    public static void main(String[] args) {
        ListOfNumbers list = new ListOfNumbers();
        list.writeList();
    }
}
}