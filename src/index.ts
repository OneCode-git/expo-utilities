import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to ExpoUtilities.web.ts
// and on native platforms to ExpoUtilities.ts
import ExpoUtilitiesModule from './ExpoUtilitiesModule';
import { ExpoUtilitiesType } from './ExpoUtilities.types';


export const getSplashStartTime = async () => {
  const splashTIme = await ExpoUtilitiesModule.getSplashStartTime();
  return splashTIme
};


export { ExpoUtilitiesType };
