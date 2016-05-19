/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les.dr.server.pages;

import java.io.PrintWriter;

/**
 *
 * @author Utilizador
 */
public class AlertPage  extends OPages{
private String _msg="";
    public AlertPage(PrintWriter o) {
        super(o);
    }
    public AlertPage(PrintWriter o, String msg){
        super(o);
        _msg= msg;
    }
    

    @Override
    protected void genTitle() {
         printTab(); out.println("<title>DR - Login Page</title>");
        }
     protected void genRightSide(){
          printTab(); out.println("<div class=\"container\">\n" +
"                                                             <h2><i class=\"fa fa-files-o\"></i>Alerta</h2> \n" +
"                                                             \n" +
"                                                              <br>\n" +
"                                                             <br>\n" +
"                                                             \n" +
"                                                             \n" +
"             <div class=\"table-responsive mailbox-messages\">\n" +
"                 <button type=\"button\" style=\"margin-left:700px;\">+</button>\n" +
"                 <br>\n" +
"                 <br>\n" +
"                <table class=\"table table-hover table-striped\">\n" +
"                  <tbody>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    \n" +
"                    </td>\n" +
"                    \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star-o text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                   \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star-o text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                   \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                    \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                  \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star-o text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                   \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star-o text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                   \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                    \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                  \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star-o text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                    \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star-o text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                   \n" +
"                  </tr>\n" +
"                  <tr>\n" +
"                    <td><input type=\"checkbox\"></td>\n" +
"                    <td class=\"mailbox-star\"><a href=\"#\"><i class=\"fa fa-star text-yellow\"></i></a></td>\n" +
"                    <td class=\"mailbox-name\"><a href=\"read-mail.html\">Alexander Pierce</a></td>\n" +
"                    <td class=\"mailbox-subject\"><b>AdminLTE 2.0 Issue</b> - Trying to find a solution to this problem...\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-trash-o\"></i></button>\n" +
"                    <button type=\"button\" class=\"btn btn-default btn-sm\"><i class=\"fa fa-edit\"></i></button>\n" +
"                    </td>\n" +
"                   \n" +
"                  </tr>\n" +
"               \n" +
"                  </tbody>\n" +
"                </table>\n" +
"                <!-- /.table -->\n" +
"              </div>\n" +
"              \n" +
"              \n" +
"\n" +
"        </div>");
    
     }
}
