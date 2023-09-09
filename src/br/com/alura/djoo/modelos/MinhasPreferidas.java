package br.com.alura.djoo.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao()>=8.5){
            System.out.println(audio.getTitulo()+" está nas suas preferidas!");
        }else {
            System.out.println(audio.getTitulo()+" é uma boa pedida pra mais tarde");
        }
    }
}
