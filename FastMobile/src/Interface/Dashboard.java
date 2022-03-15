/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ClickListener;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author Fanfo
 */
 public class Dashboard implements EntryPoint {

    public void onModuleLoad() {
      // Make a new frame, and point it at Google.
      Frame frame = new Frame("http://www.google.com/");

      // Add it to the root panel.
      RootPanel.get().add(frame);
    }
  }
