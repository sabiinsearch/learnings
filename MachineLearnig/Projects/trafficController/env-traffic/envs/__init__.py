from gym.envs.registration import register

register(
    id='trafficController-v1',
    entry_point='envs.envs_traffic:Traffic_Env',
)
