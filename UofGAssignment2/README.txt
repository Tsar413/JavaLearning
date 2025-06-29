18 October 2022 Needs Analysis
Players class
1. username
2. score
3. board class
4. takeTurn method

Square class
1. number of rows
2. number of columns
3. ships
     Presence of ships: *
4. Hits
     No shots fired: -
     Shots not hit: o
     Shots hit: x

Board class
1. constructor row generation chart 10 10
2. Two methods
     2.1 Square fills the Board
     2.2 Generate Battleships Random position and placement Non-overlapping
         5 bars Size 2
3. String.format Three cells

Battleship class (not inherited)
1. sink or not
2. HP
3. size

main
1. player registration
2. takeTurn logic determines the situation and returns a boolean
3. player manual input of coordinates

Battleship class (inherited)
    Each ship size must be set to a static class
    SmallBattleship 3 of size 1
    MediumBattleship 2 of size 2
    LargeBattleship 1 of size 3

21 October 2022 Introduction to Classes
Battleship class
This class acts as the base layer and contains the determination of whether the ship
is sunk (Boolean), the size (Integer), the amount of blood left (Integer)

LargeBattleship, MediumBattleship, SmallBattleship classes
These three classes are inherited from the Battleship class as the base layer, and it
is particularly important to note that shipNum(Integer) is given the static property
And in the upward transition, the super method is used, and the properties of whether
the parent class constructor ship is sunk and the size of the ship are called using
hardcoding, via the number is defined directly.

The Square class
This class acts as the base layer and serves to define each member of the game panel
for easy invocation in later classes. The constructor contains the row number (Integer),
the column number (Integer), whether the ship is owned (String), whether the area is
hit (String), the Battleship the area belongs to (Battleship, if any)
Use toString to normalise the output, the specific logic is: if the ship exists and
the area has not been hit, then the ship status is displayed; after the area has been hit
then modified to suit specific needs.
Use getter setter methods for easy read and write modifications.

Board class
This class acts as the base layer and control area for the display and control of the
game's panels
The Board class contains, in addition to specific properties, the following methods.
1. initialise the empty board fillBoard(), this method will initialise the board according
to the length and width in the board constructor, the goal is to achieve a board that is
all '-'
2. Create a random ship createRandomShip(int shipFinalNumber), this method aims to create
a random ship containing a Battleship Board, if a Battleship exists in the region, then
'*' will be used to represent the ship. The method's shipFinalNumber is used to determine
the ship If it is 5, it means that 5 ships of length 2 are generated; if it is not 5,
it means that it generates ships containing various types of ships.
3. the method changeHitBoard(), which modifies the player's strike board, returns a
specific board based on a table of lengths and widths and specific ship profiles.
4. The method changeShipBoard(), which modifies the board containing the player's own
ships, modifies and determines the board according to the table of lengths and widths
and the specific ships. If a ship is hit, it returns the number of the damaged ship to
the Player class, if there is no hit, it returns -1.
5. the getBattleships() method that returns the Battleship situation to the Player class
6. the toString() method for the two normalised outputs

Players class
This class acts as the base layer and also as the control area for the players and
their properties of the game
The Players class contains, in addition to specific properties, the following methods.
1. takeTurn() method, which takes the specific length and width and place of the board
containing the ships, makes a determination, and returns to the main function whether
it needs command to continue the game. This method consists of two steps, the first is
to directly replace the board used to show the player's position with changeHitBoard();
the second is to
The second step is to use the changeShipBoard() method to find the ship and return the
corresponding data. Also, based on the Battleship array from the Board, output
Battleship situation and hit situation.
2. toString() method for normalised output

Main method
This method is used to start the program, which contains the position lookup and
determines if the game is over.
