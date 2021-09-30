/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fushithemedicalaidapp;

/**
 *
 * @author Gvdme17
 */

public class Controller 
{
    static DatabaseConnection db = new DatabaseConnection();
    static FushiTheMedicalAidArray arr = new FushiTheMedicalAidArray();
    static LoginMnu lgn = new LoginMnu();
    static RegisterMnu reg = new RegisterMnu();
    static AppMnu appMain = new AppMnu();
    static PortfolioMnu port = new PortfolioMnu();
    static HelpMnu help = new HelpMnu();
    static InternalHelpMnu intHelp = new InternalHelpMnu();
    static ExternalHelpMnu extHelp = new ExternalHelpMnu();
    static AboutMnu about = new AboutMnu();
    static HealthMnu health = new HealthMnu();
    static UserMnu user = new UserMnu();
    static RewardsMnu rewards = new RewardsMnu();
    static EmergencyMnu emer = new EmergencyMnu();
    static FAQMnu faq = new FAQMnu();
    
    public static void main(String[] args)
    {
        lgn.setLocationRelativeTo(null);
        lgn.isVisible();
    }
}
