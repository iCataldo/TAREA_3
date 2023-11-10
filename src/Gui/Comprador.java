package Gui;

class Comprador {
    /*variables que guarda el nombre de la bebida
      y el vuelto del cliente
    * */
    private String sonido= "null";
    private int vuelto = 0;
    private Expendedor exp;

    public Comprador(Moneda m, int cual, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        this.exp=exp;
        Producto bebida = exp.comprarBebida(m, cual);
        //verifica si hay una bebida que comprar
        if (bebida != null) {
            this.sonido = bebida.beber();
        }
        //verifica si la moneda existe y saca el vuelto
        if (m!=null) {
            for (int i = 0; i < m.getValor(); i = i + 100) {
                if (exp.getVuelto() != null) {
                    vuelto = vuelto + 100;
                }
            }
        }
    }

    public int cuantoVuelto() {
        //retorna cuanto vuelto obtuviste
        return vuelto;
    }

    public String queBebiste() {
        //retorna el Nombre del producto
        return sonido;
    }
    public int costo(){
        return exp.getPrecio();
    }
}
