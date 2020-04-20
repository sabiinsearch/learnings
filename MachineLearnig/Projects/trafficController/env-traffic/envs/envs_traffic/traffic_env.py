import gym
from gym import error, spaces, utils
from gym.utils import seeding

class Traffic_Env(gym.Env):

    def __init__(self):
        print(‘Environment initialized’)

    def step(self):
        print(‘Step successful!’)
        
    def reset(self):
        print(‘Environment reset’)
