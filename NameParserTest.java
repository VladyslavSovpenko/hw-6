class NameParser {
    private String result1;

    public String parse(String[] names) {
        StringBuilder result =new StringBuilder();

        for(int i = 0; i < names.length; i++) {

                String firstName = names[i].split(" ")[0];

                result.append(firstName).append(", ");
             result.append("");
        }
        if (result.length()>=2) {

            result1 = result.substring(0, result.length() - 2);
        } else if(names.length==0){
            result1 ="";
        }

        return String.valueOf(result1).trim();
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}
