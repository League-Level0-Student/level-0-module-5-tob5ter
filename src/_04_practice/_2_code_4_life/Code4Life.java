package _04_practice._2_code_4_life;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Code4Life {
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
	static boolean canPlaySounds = true;
	
	
	// 1. Ask the user how many hours they spent coding this week.
	string coding = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
	int hours = Integer.parseInt(coding);
	if(hours<=2){
		JOptionPane.showMessageDialog("Get off of youtube and start coding instead!");
	}
	else if(hours>=3&&hours<=5){
		JOptionPane.showMessageDialog("You are a code ninja keep up the good work!");
	}
	else if(hours>5){
		playBatmanTheme();
		displayBatman();
	}
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
	SkillPractice skills = new SkillPractice();
	skills.skill1();
	skills.skill2();
	skills.skill3();
	skills.skill4();
	skills.skill5();
	void skill1(){
		string money = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes = Integer.parseInt(money)
		JOptionPane.showMessageDialog("You have " + dimes +" dimes");
		JOptionPane.showMessageDialog("You have "+ dimes*10 +" cents");
		int length = JOptionPane.showInputDialog("How tall are you?");
		int height = Integer.parseInt(length);
		if(height<=60){
			System.out.println("eat more food and drink more milk!")
		}
		}
	void skill2(){
		for(int i=0;i<30;i++){
			if(i%3==0){
				System.out.println(i);
			}
		}
	}
	void skill3(){
		num1 = random()
	}
	}
	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the playBatmanTheme  method, then 
	//    call the displayBatman method.



	
	private static void playBatmanTheme() {
	// NOTE: Download batman.wav from league-sounds on GitHub: https://github.com/jointheleague/league-sounds
	//	     Then put batman.wav into the "_2_code_4_life" project
	//       If you want to play a different audio, change the file name in the code below.
		if (canPlaySounds) {		
			File sound = new File("src/_04_practice/_2_code_4_life/batman.wav");
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		}
	}
	
	private static void displayBatman() {		
		ImageIcon icon = new ImageIcon("src/_04_practice/_2_code_4_life/batman.png");
		JOptionPane.showMessageDialog(null, "", "You must be Batman!", 0, icon);
	}
	

}
