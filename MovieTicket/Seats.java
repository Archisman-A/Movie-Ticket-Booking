import javax.swing.* ;
import java.awt.* ;
import java.util.* ;
import javax.swing.border.Border ;
import java.awt.event.ActionEvent ;
import java.awt.event.ActionListener ;
 
class Seats extends JFrame implements ActionListener
{
    JButton lw[] , rw[] , ct[] ;
    int count = 0 ; int arr[] ;
    int n ;
    String str ;
    int no ;
    Seats(String str1 , int n1 , int film )
    {
        str = str1 ;
        no = film ;
        n = n1 ;
        arr = new int[n] ;
        
        ImageIcon bg = new ImageIcon("BG_2.png") ;
         
        JLabel lb = new JLabel() ;
        lb.setText("Seating Arrangement") ;
        //lb.setText("Screen") ;
        lb.setIcon(bg) ;
        
        lb.setHorizontalTextPosition(JLabel.CENTER) ;
        lb.setVerticalTextPosition(JLabel.TOP) ;
        lb.setForeground(new Color(0xf70707)) ;
        lb.setFont(new Font("MV Boli",Font.BOLD,25)) ;
        lb.setIconTextGap(-40) ;
        lb.setVerticalAlignment(JLabel.CENTER) ;
        lb.setHorizontalAlignment(JLabel.CENTER) ;
        lb.setBounds(0,-30,640,480) ;
        
        int c = 0 , y = 0 ;
        lw = new JButton[10] ;
        for( int i = 0 ; i < 5 ; i ++ )
        {
            int x = 0 ;
            int ch = 0 ;
            for ( int j = 0 ; j < 2 ; j ++ )
            {
                lw[c] = new JButton((Integer.toString(c+1) + "A")) ;
                lw[c].setBounds((10+x),(20+y),60,60) ;
                lw[c].addActionListener(this) ;
                lw[c].setFocusable(false) ;
                lw[c].setVisible(true) ;
                lw[c].setForeground(Color.white) ;
                lw[c].setBackground(new Color(0xff3300)) ;
                lw[c].setBorder(BorderFactory.createEtchedBorder()) ;
                c++ ;
                x += 70 ;
            }
            y += 80 ;
        }
        
        c = 0 ; y = 0 ;
        rw = new JButton[10] ;
        for( int i = 0 ; i < 5 ; i ++ )
        {
            int x = 0 ;
            int ch = 0 ;
            for ( int j = 0 ; j < 2 ; j ++ )
            {
                rw[c] = new JButton((Integer.toString(c+1) + "B" )) ;
                rw[c].setBounds((500+x),(20+y),60,60) ;
                rw[c].addActionListener(this) ;
                rw[c].setFocusable(false) ;
                rw[c].setVisible(true) ;
                rw[c].setForeground(Color.white) ;
                rw[c].setBackground(new Color(0xff3300)) ;
                rw[c].setBorder(BorderFactory.createEtchedBorder()) ;
                c++ ;
                x += 70 ;
            }
            ch ++ ;
            y += 80 ;
        }
        
        c = 0 ; y = 0 ;
        int ch = 0 ;
        ct = new JButton[20] ;
        for( int i = 0 ; i < 4 ; i ++ )
        {
            int x = 0 ;
            for ( int j = 0 ; j < 5 ; j ++ )
            {
                ct[c] = new JButton((Integer.toString(c+1) + Character.toString((char)(67+ch)))) ;
                ct[c].setBounds((150+x),(100+y),60,60) ;
                ct[c].addActionListener(this) ;
                ct[c].setFocusable(false) ;
                ct[c].setVisible(true) ;
                ct[c].setForeground(Color.white) ;
                ct[c].setBackground(new Color(0xff3300)) ;
                ct[c].setBorder(BorderFactory.createEtchedBorder()) ;
                c++ ;
                x += 70 ;
            }
            y += 80 ;
            ch++ ;
        }
        
        int arr[] = new int[40] ;
        File obj = new File() ;
        obj.FileRead(arr,no) ;
        for(int i = 0 ; i < 40 ; i ++)
        {
            if( arr[i] != 0 )
            {
                if(arr[i] <= 10)
                {
                    lw[arr[i]-1].setBackground(Color.lightGray) ;
                    lw[arr[i]-1].setEnabled(false) ;
                }
                else if(arr[i] <= 20)
                {
                    rw[arr[i]-11].setBackground(Color.lightGray) ;
                    rw[arr[i]-11].setEnabled(false) ;
                }
                else
                {
                    ct[arr[i]-21].setBackground(Color.lightGray) ;
                    ct[arr[i]-21].setEnabled(false) ;
                }
            }
            else
            {
                break ;
            }
        }
        
        this.setTitle("Movie Mania") ;
        //this.setLayout(null) ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        //this.setSize(655,458) ;
        this.setResizable(false) ;
        this.setVisible(true) ;
        
        //ImageIcon ic = new ImageIcon("LOGO.png") ;
        this.setIconImage((new ImageIcon("LOGO.png")).getImage()) ;
        
        for( int i = 0 ; i < 10 ; i++ )
        {
            this.add(lw[i]) ;
            this.add(rw[i]) ;
        }
        for( int i = 0 ; i < 20 ; i ++ )
        {
            this.add(ct[i]) ;
        }
        this.add(lb) ;
        this.pack() ;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        for ( int i = 0 ; i < 10 ; i ++ )
        {
            if ( e.getSource() == lw[i] )
            {
                lw[i].setBackground(Color.green) ;
                lw[i].setEnabled(false) ;
                arr[count++] = i+1 ;
                break ;
            }
            if ( e.getSource() == rw[i] )
            {
                rw[i].setBackground(Color.green) ;
                rw[i].setEnabled(false) ;
                arr[count++] = 11 + i ;
                break ;
            }
        }
        for ( int i = 0 ; i < 20 ; i ++ )
        {
            if ( e.getSource() == ct[i] )
            {
                ct[i].setBackground(Color.green) ;
                ct[i].setEnabled(false) ;
                arr[count++] = 21 + i ;
                break ;
            }
        }
        if ( count == n )
        {
            this.dispose() ;
            File obj = new File() ;
            obj.FileWrite(str , arr , no ) ;
        }
    }
}