
x = 5
y = 10

# To take inputs from the user
#x = input('Enter value of x: ')
#y = input('Enter value of y: ')

# create a temporary variable and swap the values
#temp = x
# x = y
# y = temp

x,y = y,x

print('The value of x after swapping: {}'.format(x))
print('The value of y after swapping: {}'.format(y))

def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """