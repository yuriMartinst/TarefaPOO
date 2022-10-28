import javax.swing.*;

public class Janela {

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setTitle("Tarefas");

        frame.setSize(420,420);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);
        frame.add(panel);
        JLabel lbl_tarefa = new JLabel("Tarefa");
        lbl_tarefa.setBounds(50,50,50,50);
        panel.add(lbl_tarefa);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(50,90,280,80);
        panel.add(textArea);

        JLabel lbl_tarefa2 = new JLabel("Prioridade");
        lbl_tarefa2.setBounds(50,180,200,25);
        panel.add(lbl_tarefa2);

        String prioridade[] = {"Baixa","Média","Alta"};
        JComboBox comboBox = new JComboBox<>(prioridade);
        comboBox.setBounds(50,220,280,30);
        panel.add(comboBox);

        JCheckBox checkBox = new JCheckBox("Finalizado");
        checkBox.setBounds(50,280,200,25);
        panel.add(checkBox);

        JButton button1 = new JButton("CANCELAR");
        button1.setBounds(280,330,120,40);
        panel.add(button1);

        JButton button2 = new JButton("SALVAR");
        button2.setBounds(150,330,120,40);
        panel.add(button2);

        frame.setVisible(true);
    }

}