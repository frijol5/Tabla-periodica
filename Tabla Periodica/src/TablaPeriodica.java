import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablaPeriodica implements ActionListener {

    private JFrame panel;
    Fondo fondo;
    private int width = 1200;
    private int heigth = 700;
    private int subir = -20;
    JButton[] metalesAlcalinos;
    JButton[] metalesAlcalinoterreos;
    JButton[][] metalesPesados;
    JButton[][] metalesYGases;
    JButton[] gasesNobles;
    JButton[] lactanidosYactinidos;

    public TablaPeriodica() {

        panel = new JFrame("Tabla Periodica");
        fondo = new Fondo("Fondo");
        fondo.setBounds(0,0,width,heigth);

        //Botones
        metalesAlcalinos = new JButton[7];
        int y = 0;
        int x =0;
        for (int indice=0;indice<metalesAlcalinos.length;indice++)
        {
            metalesAlcalinos[indice] = new JButton();
            metalesAlcalinos[indice].setBounds(106,57+y+subir,55,68);
            panel.add(metalesAlcalinos[indice]);
            y+=68;
        }
        y = 0;
        metalesAlcalinoterreos = new JButton[6];
        for (int indie=0;indie<metalesAlcalinoterreos.length;indie++)
        {
            metalesAlcalinoterreos[indie] = new JButton();
            metalesAlcalinoterreos[indie].setBounds(161,125+y+subir,55,68);
            panel.add(metalesAlcalinoterreos[indie]);
            y+=68;
        }
        y=0;
        metalesPesados = new JButton[10][4];
        int prueba=0;
        for (int indo=0;indo<10;indo++)
        {
            for (int indo2=0;indo2<4;indo2++)
            {

                metalesPesados[indo][indo2] = new JButton(String.valueOf(prueba));
                metalesPesados[indo][indo2].setBounds(216+x,261+y+subir,55,68);
                panel.add(metalesPesados[indo][indo2]);
                y+=68;
                prueba++;
            }
            x += 55;
            y=0;
        }
        y=0;
        x=0;
        metalesYGases = new JButton[5][6];
        for (int indo=0;indo<5;indo++)
        {
            for (int indo2=0;indo2<6;indo2++)
            {
                metalesYGases[indo][indo2] = new JButton();
                metalesYGases[indo][indo2].setBounds(766+x,125+y+subir,55,68);
                panel.add(metalesYGases[indo][indo2]);
                y+=68;
            }
            x += 55;
            y=0;
        }
        gasesNobles = new JButton[7];
        y=0;
        for (int i=0;i<gasesNobles.length;i++)
        {
            gasesNobles[i] = new JButton();
            gasesNobles[i].setBounds(1041,57+y+subir,55,68);
            panel.add(gasesNobles[i]);
            y+=68;
        }
        lactanidosYactinidos = new JButton[30];
        x = 0;
        y = 0;
        for (int c=0;c<lactanidosYactinidos.length;c++)
        {
            lactanidosYactinidos[c] = new JButton();
            lactanidosYactinidos[c].setBounds(271+x,523+y,55,68);
            panel.add(lactanidosYactinidos[c]);
            x+=55;
            if (c==14)
            {
                y+=68;
                x=0;
            }
        }





        panel.add(fondo);
        panel.setSize(width,heigth);
        panel.setResizable(false);
        panel.setLocationRelativeTo(null);
        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setVisible(true);

        metalesAlcalinos[0].addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Elementos elementos = new Elementos("Zorra");
    }
}