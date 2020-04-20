from gym.envs.registration import register

register(
    id='traffic-env-v0',
    entry_point='env_traffic.envs:Traffic_Env',
)
