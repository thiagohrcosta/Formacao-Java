package classesAuxiliares;

/* Receber somente alguém que tenha "Contrato" da interface de PermitirAcesso. */
/* e chamar o autenticar */

import EstudoInicial.interfaces.PermitirAcesso;

public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;

    public boolean autenticar(){
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }

}

