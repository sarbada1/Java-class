package gui;

import javax.swing.*;
import java.awt.*;

public class ChatApp extends JFrame {

    //declare component 
    public void addMenu(){
        JMenuBar mb = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu helpMenu = new JMenu("Help");

        //menu items for file menu
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem exitItem = new JMenuItem("Exit");

        // menu items for edit menu
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        //menu items for view menu
        JMenuItem fontItem = new JMenuItem("Font");
        JMenuItem wrapItem = new JMenuItem("Wrap");

        // menu items for help menu
        JMenuItem helpItem = new JMenuItem("Help topics");
        JMenuItem aboutItem = new JMenuItem("About chatapp");
     
        //add menu items to menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.add(closeItem);
        fileMenu.add(exitItem);
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        viewMenu.add(fontItem);
        viewMenu.add(wrapItem);
        helpMenu.add(helpItem);
        helpMenu.add(aboutItem);

        // add menus to menubar
        mb.add(fileMenu);
        mb.add(editMenu);
        mb.add(viewMenu);
        mb.add(helpMenu);
        this.add(mb,BorderLayout.NORTH);
        setJMenuBar(mb);
    }

public void addOtherComponents()
{
    JPanel mainPanel=new JPanel();
    JPanel statusPanel= new JPanel();

    // chat app controls area added in center panel
    JTextArea chatText= new JTextArea();
    JScrollPane scrollPane= new JScrollPane(chatText);
    JTextField inputText= new JTextField(20);
    JButton sendButton= new JButton("Send Message");
    JLabel statusLabel=new JLabel("Status:");
    mainPanel.setLayout(new BorderLayout());
    mainPanel.add(new JLabel("Your SMS Messages"),BorderLayout.NORTH);
    mainPanel.add(chatText,BorderLayout.CENTER);
    JPanel controlsPanel=new JPanel();
    controlsPanel.add(inputText); // flowlayout is applied as default to controlspanel
    controlsPanel.add(sendButton);
    mainPanel.add(controlsPanel,BorderLayout.SOUTH);
    statusPanel.add(statusLabel);
    
    this.add(mainPanel,BorderLayout.CENTER);
    this.add(statusPanel,BorderLayout.SOUTH);
    

}

        public ChatApp()
        {
            addMenu();
            addOtherComponents();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400,800);
            setVisible(true);
        }
        public static void main(String[] args){
          ChatApp app =  new ChatApp();
        }
    }

