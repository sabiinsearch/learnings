from gym.envs.registration import register

register(
    id='trafficCtlr-v0',
    entry_point='envs.traffic_envs:TrafficEnv',
) 
