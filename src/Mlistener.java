import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mlistener implements MouseListener, ActionListener {
   
   private final Color BACKGROUND = new Color(75,0,130); //indigo
   private final Color FOREGROUND = new Color(173,216,230); //light blue
   private final Color BACKGROUND_MOUSE_ENTERED = new Color(75,0,90);

   private JButton jbList, jbBrowse, jbAdd, jbDel, jbClose;

   //Constructor
   public Mlistener( JButton jbList, JButton jbBrowse, JButton jbAdd, JButton jbDel, JButton jbClose ) {
      this.jbList = jbList;
      this.jbBrowse = jbBrowse;
      this.jbAdd = jbAdd;
      this.jbDel = jbDel;
      this.jbClose = jbClose;
   }


   @Override
   public void mouseClicked( MouseEvent e ) {
   }

   @Override
   public void mouseEntered( MouseEvent e ) {
      
      if( e.getSource() == jbList )
         jbList.setBackground( BACKGROUND_MOUSE_ENTERED );  
      else if( e.getSource() == jbBrowse )
         jbBrowse.setBackground( BACKGROUND_MOUSE_ENTERED );   
      else if( e.getSource() == jbAdd )
         jbAdd.setBackground( BACKGROUND_MOUSE_ENTERED );   
      else if( e.getSource() == jbDel )
         jbDel.setBackground( BACKGROUND_MOUSE_ENTERED );   
      else if( e.getSource() == jbClose ) {
         jbClose.setIcon( new ImageIcon( "res/close-over.png" ) );
         jbClose.setVisible( true );
      }
   }

   @Override
   public void mouseExited( MouseEvent e ) {

      if( e.getSource() == jbList )
         jbList.setBackground( BACKGROUND ); 
      else if( e.getSource() == jbBrowse )
         jbBrowse.setBackground( BACKGROUND );  
      else if( e.getSource() == jbAdd )
         jbAdd.setBackground( BACKGROUND );  
      else if( e.getSource() == jbDel )
         jbDel.setBackground( BACKGROUND );  
      else if( e.getSource() == jbClose )
         jbClose.setIcon( new ImageIcon( "res/close.png" ) );
   }

   @Override
   public void mousePressed( MouseEvent e ) {

      if( e.getSource() == jbList )
         jbList.setForeground( BACKGROUND_MOUSE_ENTERED );  
      else if( e.getSource() == jbBrowse )
         jbBrowse.setForeground( BACKGROUND_MOUSE_ENTERED );   
      else if( e.getSource() == jbAdd )
         jbAdd.setForeground( BACKGROUND_MOUSE_ENTERED );   
      else if( e.getSource() == jbDel )
         jbDel.setForeground( BACKGROUND_MOUSE_ENTERED );   
   }

   @Override 
   public void mouseReleased( MouseEvent e ) {

      if( e.getSource() == jbList )
         jbList.setForeground( FOREGROUND ); 
      else if( e.getSource() == jbBrowse )
         jbBrowse.setForeground( FOREGROUND );  
      else if( e.getSource() == jbAdd )
         jbAdd.setForeground( FOREGROUND );  
      else if( e.getSource() == jbDel )
         jbDel.setForeground( FOREGROUND );  
   }

   @Override
   public void actionPerformed( ActionEvent e ) {
      
      ListPersonel lp;

      if( e.getSource() == jbList ) {
         lp = new ListPersonel( new Color(144,255,255) );
         lp.addTo( AnaPencere.jpnlContent );
      }
      else if( e.getSource() == jbBrowse )
         System.exit( 0 );
      else if( e.getSource() == jbAdd )
         System.exit( 0 );
      else if( e.getSource() == jbDel )
         System.exit( 0 );
      else if( e.getSource() == jbClose )
         System.exit( 0 );
   }

}
