public class televizyon {
   
        private int kanal;
        private int sesSeviyesi;
        private boolean acik;

        public void ac(){
            if ( acik == false){
                System.out.println("Televizyon Açılıyor...");
                acik = true;
            }
            else {
                System.out.println("Televizyon Zaten Açık");
            }
        }

        public void kapat(){
            if (acik){
                System.out.println("Televizyon Kapatılıyor...");
                acik = false;

            }
            else {
                System.out.println("Televizyon Zaten Kapalı");
            }
        }

        public void setKanal(int yeniKanal){
            if(acik && yeniKanal>0 && yeniKanal<500){
                kanal = yeniKanal;
            }
            else{
                System.out.println("Televizyon Kapalı ya da Yanlış bir Kanal değeri yazdınız");
            }
        }


    

        public int getKanal() {
            return kanal;
        }

        public int getSesSeviyesi() {
            return sesSeviyesi;
        }

        public void setSesSeviyesi(int sesSeviyesi) {
            if(acik && sesSeviyesi>0 && sesSeviyesi<20){
                this.sesSeviyesi = sesSeviyesi;
            }
            else{
                sesSeviyesi = 1; // ses seviyesine varsayılan olarak 1 değerini atadım.

            }
            
        }

        public boolean isAçik() {
            return acik;
        }

        public void setAçik(boolean açik) {
            this.acik = acik;
        }

        public void goster(){
            System.out.println("Tv açıklık durumu: " + acik + " kanal: " + kanal + " ses seviyesi: " + sesSeviyesi);
        }
    







       
    }

