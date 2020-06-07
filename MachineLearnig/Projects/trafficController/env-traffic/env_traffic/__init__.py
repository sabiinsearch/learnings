from gym.envs.registration import register

register(
    id='trafficController-v1',
    entry_point='envs_traffic.envs:Traffic_Env',
)
