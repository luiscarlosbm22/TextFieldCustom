
package slider_notifi;

import java.awt.Color;
import javax.swing.JSlider;

/**
 *
 * @author MenDark
 */
public class JsliderCustom extends JSlider{
    public JsliderCustom(){
        setOpaque(false);
        setBackground(new Color(180, 180, 180));
        setForeground(new Color(69, 124, 235));
        setUI(new JSliderUI(this));
    }
}
