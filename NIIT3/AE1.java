package com.company.javaRelearn.NIIT3;/*
    说明
    - 在该文件中添加您的代码，除了调用您的方法外，main 方法保持不变。
    - 按问题顺序，将所有方法添加到主方法的下面。
    - 每项任务只涉及编写一个方法。您不需要添加额外的主方法。
    - 仔细阅读每项任务的说明。
    - 单独提交一份.java文件
    - 文件命名为AE1_学号.java
    - 除非在任务中明确要求，否则无需执行错误检查。
*/

/*
    非特定任务评分：
     - 在此添加学号，姓名
     - 清晰明了的注释
     - 正确的Java变量与方法的命名格式
*/

public class AE1 {

	public static void main(String[] args) {

/*
		 * 示例任务：
		 *
		 * 这段代码演示了您应该如何回答问题。您将被要求创建代码来执行某些任务。
		 * 重要的是，除了需要调用你创建的方法外，你不能修改这个主方法。
		 *
		 * 因此，如果我要求你创建一个名为 helloWorld 的方法，并打印出
		 * 下面这行："hello world!
		 * 如图所示，在 main 方法下面创建方法，并在 main 中调用它，如下所示。
*/
		helloWorld();

		/*
		 *  提醒您，您应该自己完成这项评估，以检验自己的理解能力，并加强自己的解题技巧。
		 */
		
		
		/*
		 * 任务1:
		 * 
		 * 创建一个名为 “task1 ”的方法来计算矩形的面积，并在 main 中调用该方法。
		 * 该方法不会指定任何输入参数。在该方法中，使用Scanner捕捉用户输入。应提示用户矩形的长和宽。
		 * 注意，矩形的长和宽可以精确到小数点后两位。
		 * 输入后，计算面积并打印到屏幕上。
		 * 
		 */

		/*
		 * 任务2:
		 * 
		 * 创建一个名为task2的方法，接受两个整数输入参数 max 和 number。
		 * 该方法应打印出满足以下条件的 1 到 max（含）之间的数值总数（而不是数值本身）：
		 *
		 * 值必须是奇数，且值必须是 number 的因数。
		 * 你的主方法必须输入 max = 99。例如，如果参数 task2(99, 39)，输出结果应该是 4。
		 */

		/*
		 * 任务3
		 * 
		 * 创建一个名为task3的方法，接收一个 int 参数并将其赋值给变量challenge。该方法将在控制台播放桌面游戏。
		 * 我们的想法是让玩家掷一个 20 面的骰子，并在终端显示他们的结果。
		 *
		 * 我们不会要求你对掷骰子进行编程，你可以假设用户只需输入 1 到 20 之间的数字即可。
		 *
		 * 游戏会进行一系列回合。每轮游戏都会提示玩家输入掷出的数字。
		 * 如果玩家掷出的数字高于挑战值，则攻击怪物成功，怪物将损失 1 点HP。如果玩家的掷骰子数小于或等于挑战值，则不成功。
		 *
		 * 如果玩家没有成功，怪物会发动攻击。
		 * 当玩家第一次失败时，怪物会失手，玩家不会失去1HP。
		 * 但是，从第二次失败开始，怪物会一直攻击成功，玩家会损失1HP。
		 *
		 * 游戏一直持续到玩家或怪物失去所有命中点为止。玩家和怪物都应从3HP开始。
		 *
		 * 您必须在这段代码中使用 while 循环。输入参数challenge应设置为 10。
		 */

		/*
		 * 任务4
		 *
		 * 创建一个将整数作为输入参数的方法task4。该值将用于一个竞猜游戏，用户需要输入一系列的猜测，尝试猜出该方法（即输入参数）所持有的数字。
		 *
		 * 玩家每次猜测时，都会收到输入提示。下面是一个预期输入的示例：
		 *
		 * 16 97
		 *
		 * 玩家每次猜测时都要输入两个数字，中间用一个空格隔开。您的方法应该接受这两个猜测，并确定哪个值更接近秘密数字。
		 * 您的方法应确保输入的数字正好是 2 个。如果没有，则应打印错误信息。
		 *
		 * 如果其中一个猜测正确，那么玩家获胜。否则，玩家将看到一些控制台输出，告诉他们距离有多远。
		 *
		 * 用户应该看到的输出必须是格式化的，'0'将用作填充。读出的结果应为 3 个字符。
		 * 因此，如果秘密数字是 364，而用户输入了 4 300 作为其猜测数字，那么读出的结果必须准确无误：
		 * 您距离秘密数字还有 064！
		 */
		
		/*
		 * 将方法调用放置于此
		 */


	}


	/*
	 * 例子
	 */
	private static void helloWorld() {
		System.out.println("hello world!");
	}
	
	/*
	 * 将答案放置于此0
	 */

}
