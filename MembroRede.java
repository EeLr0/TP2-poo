public interface MembroRede {
// metodo para enviar uma pedrada a outra pessoa
Pedrada manda(MembroRede membro);
//mostra o perfil
void mostraPerfil();
//muda a visiblidade de visivel para nao visivel
void mudarVisiblidade();
//mandar para todos mebros?
void manda();
//escrever na pedrada de algum membro/ retorno void?
void screveNaPedra(Isecmarini membro);
//conectar com outro membro?
void conecta(Isecmarini outroMembro);
//desconectar de outro membro
void desconectar(Isecmarini outroMembro);


}
