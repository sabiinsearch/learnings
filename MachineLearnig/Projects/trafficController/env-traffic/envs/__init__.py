from gym.envs.registration import register

register(
    id='trafficController-v0',
    entry_point='envs.env_traffic:Traffic_Env',
)
