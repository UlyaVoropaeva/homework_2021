package lesson_8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


    public class CalcListener implements ActionListener {

        private final StringBuilder stringBuilder;
        private String result;

        public CalcListener(StringBuilder stringBuilder) {
            this.stringBuilder = stringBuilder;

        }

        public String getCalcListener() {
            return result;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        public String calculate(String string) {

            StringBuffer strList = new StringBuffer();
            String strList2;

            for (String listElement : string.trim().split("")) {
                strList.append(listElement);
            }

            while (true) {
                if (strList.lastIndexOf("(") != -1) {
                    strList2 = strList.substring(strList.lastIndexOf("("), strList.length());
                    int i = strList2.indexOf(")");
                    strList2 = strList2.substring(1, i);
                    String res1 = calcOperator(strList2);
                    strList.replace(strList.lastIndexOf("("), strList.lastIndexOf("(") + i + 1, res1);

                } else {
                    result = calcOperator(strList.toString());
                    break;
                }
            }

            return result;
        }

        public String calcRes(String strList2) {

            double result = 0;
            if(strList2.indexOf("-")==0) {
                return strList2;
            }


            if (strList2.indexOf("+") != -1) {
                result = Double.parseDouble(strList2.substring(0, strList2.indexOf("+"))) +
                        Double.parseDouble(strList2.substring(strList2.indexOf("+") , strList2.length()));
            } else if (strList2.indexOf("-") != -1) {
                result = Double.parseDouble(strList2.substring(0, strList2.indexOf("-"))) +
                        Double.parseDouble(strList2.substring(strList2.indexOf("-"), strList2.length()));
            } else if (strList2.indexOf("*") != -1) {
                result = Double.parseDouble(strList2.substring(0, strList2.indexOf("*"))) *
                        Double.parseDouble(strList2.substring(strList2.indexOf("*") + 1, strList2.length()));
            } else if (strList2.indexOf("/") != -1) {
                result = Double.parseDouble(strList2.substring(0, strList2.indexOf("/"))) /
                        Double.parseDouble(strList2.substring(strList2.indexOf("/") + 1, strList2.length()));
            } else if (strList2.indexOf("sqrt") != -1) {
                result = Math.sqrt(Double.parseDouble(strList2.substring(0, strList2.indexOf("sqrt"))));
            }

            return String.valueOf(result);

        }


        public String calcOperator(String string) {

            String res = "";
            boolean itr = true;
            List<String> strList = new ArrayList<>();

            while (itr) {
                String[] operator = {"*", "/", "+", "-"};
                StringBuilder resOperation = new StringBuilder();
                resOperation.append(string);

                for (int i = 0; i < operator.length; ) {

                    int min = 0, max = string.length();

                    if (string.indexOf(operator[i]) != -1) {
                        for (int j = string.indexOf(operator[i]); j > 0; --j) {

                            if (string.charAt(j - 1) == '*' || string.charAt(j - 1) == '/'
                                    || string.charAt(j - 1) == '+' || string.charAt(j - 1) == '-') {
                                min = j;
                                break;
                            }
                        }
                        for (int j = string.indexOf(operator[i]) + 1; j < string.length(); ++j) {
                            if (string.charAt(j) == '.' && (j + 2) != string.length()) {
                                j = j + 2;
                                max = j;
                            }
                            if ((string.charAt(j) == '*' || string.charAt(j) == '/'
                                    || string.charAt(j) == '+' || string.charAt(j) == '-')) {
                                max = j;
                                break;
                            }
                        }

                        res = calcRes(string.substring(min, max));

                        string = String.valueOf(resOperation.replace(min, max, res));
                        break;
                    }


                    if (string.indexOf("+") == -1 && string.indexOf("-") == -1 &&
                            string.indexOf("*") == -1 && string.indexOf("/") == -1 ) {
                        itr = false;
                    }
                    i++;
                }
            }
            return string;
        }
        public String otrRes(String strList2) {
            for (int i = 0; i < strList2.length(); i++) {
                if (strList2.indexOf("+") == -1 && strList2.indexOf("-") == -1 &&
                        strList2.indexOf("*") == -1 && strList2.indexOf("/") == -1 && strList2.charAt('-') == 0) {
                    return strList2;
                }
            }
            return strList2;
        }
    }




