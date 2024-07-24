public class ControleRemoto {
    private Televisao tv;
    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }
    //liga e desliga
    public void ligaDesliga (String userop) {
        if (userop.equalsIgnoreCase("sim")) {
            tv.setEstado("on");
            System.out.println("Ligando...");
        } else if (userop.equalsIgnoreCase("nao")){
            tv.setEstado("off");
            System.out.println("Desligando...");
        } else {
            System.out.println("Erro ao ligar ou desligar TV.");
        }
    }
    //volume
    public void volumeTV(String userop) {
        if (userop.equalsIgnoreCase("aumentar")) {
            tv.setVolume((tv.getVolume()) + 1);
            System.out.println("Volume aumentado em uma unidade.");
            System.out.println("Agora o volume está em: " + tv.getVolume());
        } else if (userop.equalsIgnoreCase("diminuir")) {
            tv.setVolume((tv.getVolume()) - 1);
            System.out.println("Volume decrescido em uma unidade.");
            System.out.println("Agora o volume está em: " + tv.getVolume());
        } else {
            System.out.println("Falha ao abaixar ou aumentar volume da TV.");
        }
    }
    //canal
    public void canalTV(String userop, int troca) {
        if (userop.equalsIgnoreCase("aumentar")) {
            tv.setCanal((tv.getCanal()) + 1);
            System.out.println("Canal aumentado em uma unidade.");
            System.out.println("Agora o canal está é: " + tv.getCanal());
        } else if (userop.equalsIgnoreCase("diminuir")) {
            tv.setCanal((tv.getCanal()) - 1);
            System.out.println("Canal diminuido em uma unidade.");
            System.out.println("Agora o canal está é: " + tv.getCanal());
        } else if (userop.equalsIgnoreCase("outro")) {
            if (troca < 1 || troca > 50) {
                System.out.println("Canal não existente!");
            } else {
                tv.setCanal(troca);
                System.out.println("Canal trocado com sucesso.");
                System.out.println("Agora o canal está é: " + tv.getCanal());
            }
        } else {
            System.out.println("Falha ao trocar de canal.");
        }
    }
}