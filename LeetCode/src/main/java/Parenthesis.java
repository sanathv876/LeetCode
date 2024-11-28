class Parenthesis{
    public boolean isValid(String s) {
        String[] sep = s.split("");
        if(sep.length == 1){
            return false;
        }
        int pcount =0;
        for(int i = 0; i < sep.length; i ++){
            switch(sep[i]){
                case "(":
                    if(!sep[i+1].equals(")")&& i+1 == sep.length -1){
                        return false;
                    }
                    pcount++;
                    break;
                case "[":
                    if(!sep[i+1].equals("]")&& i+1 == sep.length -1){
                        return false;
                    }
                    pcount++;
                    break;
                case "{":
                    if(!sep[i+1].equals("}")&& i+1 == sep.length -1){
                        return false;
                    }
                    pcount++;
                    break;
                case "}":
                    if ( i == 0 ){
                        break;
                    }
                    if(!sep[i-1].equals("{")&& i+1 == sep.length -1){
                        return false;
                    }
                    pcount++;
                    break;
                case "]":
                    if ( i == 0 ){
                        break;
                    }
                    if(!sep[i-1].equals("[")&& i+1 == sep.length -1){
                        return false;
                    }
                    pcount++;
                    break;
                case ")":
                    if ( i == 0 ){
                        break;
                    }
                    if(!sep[i-1].equals("(")&& i+1 == sep.length -1){
                        return false;
                    }
                    pcount++;
                    break;
            }
        }

        return pcount == sep.length;


    }

    public static void main(String[] args) {
        Parenthesis p = new Parenthesis();
        System.out.println(p.isValid("){"));
    }

}
