public class Televisore
{
    // variabili d'istanza
    private String marca;
    private String colore;
    private int volume;
    private double pollici;

    public Televisore(String inputMarca, String inputColore, double inputPollici)
    {
        // inizializzo le variabili d'istanza
        marca=inputMarca;
        colore=inputColore;
        pollici=inputPollici;
        volume=0;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public String getColore()
    {
        return colore;
    }
    
    public int getVolume()
    {
        return volume;
    }
    public void setVolume(int a)
    {
        if(a<100)
            volume=a;
        else{
            Main.output("attenzione:\tho impostato il volume a 99 perchè altrimenti il televisore esploderà");
            volume=99;
        }
    }
    
    public double getPollici()
    {
        return pollici;
    }
    
    public void printTelevisore(){
        Main.output("\tmarca:\t\t"+marca);
        Main.output("\tcolore:\t\t"+colore);
        Main.output("\tpollici:\t"+pollici);
        Main.output("\tvolume:\t\t"+volume);
    }
    
    public void alzaVolume()
    {
        if(volume+5<100)
            setVolume(volume+5);
        else
        {
            Main.output("attenzione:\tho impostato il volume a 99 perchè altrimenti il televisore esploderà");
            volume=99;
        }
    }
    public void abbassaVolume()
    {
        setVolume(volume-5);
        if(volume<0)
        {
            Main.output("attenzione:\tho impostato il volume a 0 perchè altrimenti il televisore esplode");
            volume = 0;
        }
    }
}