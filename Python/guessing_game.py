import random
count = 5
global player_score
global computer_score


def game():
    
    while count > 0:  # This game runs 10 times
        try:
            global player_score
            global computer_score
            player_score = 0
            computer_number = random.randint(1, 10)  # Random number between 1 and 10
            player_number = int(input("Please choose a random number: "))
            if player_number != computer_number:
                print("Computer wins...", computer_number)
                computer_score += 1
                count -= 1
            else:
                print("You win!", computer_number)
                player_score += 1
                count = count - 1
        except ValueError:
            print("Please enter a number: ")

# Print out final scores
print("Final scores: ")
print("Player score: ", player_score)
print("Computer score: ", computer_score)

# Compare the two scores to see who won
if player_score > computer_score:
    print("You win! Score: ", player_score)
elif player_score < computer_score:
    print("Computer wins. Score: ", computer_score)
else:
    print("It's a draw!")

