/*


        // write your code here
        ArrayList list = new ArrayList();

        list.add(100);
        list.add(50);
        list.add(10);
        list.add(5);
        list.add(1);
        int i = 89;
        ArrayList liste_temp = new ArrayList();
        liste_temp.add(9);
        liste_temp.add(40);
        liste_temp.add(45);
        liste_temp.add(90);
        liste_temp.add(91);
        for (i = 1; i < 99; i++) {

            int tem = (int) list.get(0);
            //int _temp_i = (int) liste_temp.get(i);
            int _temp_i = i;
            String a = "";
            int index = -1;
            for (var
                    item :
                    list) {
                index++;
//2. yöntem lx gördüğü yerde cx yapcak
                if (_temp_i >= (int) item) {

                    int repeat_count = _temp_i / (int) item;


                    //  int mod = _temp_i % (int) item;
                    //TEK BASAMAKLI KENDİNE BOL BASAMAK EKLE
                    int basamak=(_temp_i+"").length();
                    int four_again = (tem - tem / 10);
                    int mod = ((_temp_i + "").length() - 1) * 10;

                    if (mod != 0 && _temp_i % mod != 0) four_again -= four_again % 10;
                    if (four_again == _temp_i) {
                        char sol;
                        if (mod==0)  sol=convert_Method((int) list.get(index+1));
                        else
                            sol=convert_Method(tem-four_again);
                        char sag= convert_Method(tem);
                        a += sol +""+ sag;
                        _temp_i -= four_again;
                    }
                    else if (repeat_count > 3) {
                        // System.out.println("Tekrar");


                        a += (convert_Method((int) item)) + "" + convert_Method(tem);


                    }
                    else
                    {
                        a += (convert_Method((int) item) + "").repeat(repeat_count);

                    }


                    _temp_i -= repeat_count * (int) item;

                }
                tem = (int) item;
            }
            System.out.print(a);
            System.out.println("\t\t=>=\t" + i);
        }


    }

    private static String Roma(String temp, int index, String t_ret) {
        //  if (index > temp.length()) return;
        t_ret += convert_Method(temp.charAt(index));

        return Roma(temp, index, t_ret);
    }

    private static char convert_Method(int num) {
        switch (num) {
            case 1:
                return 'I';

            case 5:
                return 'V';
            case 10:
                return 'X';
            case 50:
                return 'L';
            case 100:
                return 'C';
            case 500:
                return 'D';
            case 1000:
                return 'M';
            case -1:
                return 1;
            default:
                break;

        }
        return '2';
    }
}
*/