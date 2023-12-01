static String rollingString(String s, String[] operations) {
        StringBuffer sb = new StringBuffer(s);
        for(String op:operations)
        {
            String[]info=op.split(" ");
            int start=Integer.parseInt(info[0]);
            int end=Integer.parseInt(info[1]);
            char dir=info[2].charAt(0);
            
            for(int i=start;i<=end;i++)
            {
                char c=sb.charAt(i);
                if(dir=='R')
                {
                    int alpno=c-97;
                    int res=(alpno+1)%26;
                    char newc=(char)(97+res);
                    sb.setCharAt(i,newc);
                }
                else if(dir=='L')
                {
                    int alpno=c-97;
                    int res=(alpno-1+26)%26;
                    char newc=(char)(97+res);
                    sb.setCharAt(i,newc);
                }
            }
        }
        return sb.toString();
         
    }